package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.LieuDao;
import com.takima.backskeleton.models.Lieu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LieuService {
    private final LieuDao lieuDao;

    public List<Lieu> findAll() {
        Iterable<Lieu> it = lieuDao.findAll();
        List<Lieu> lieux = new ArrayList<>();
        it.forEach(lieux::add);
        return lieux;
    }

    public Optional<Lieu> findById(Long id) {
        return lieuDao.findById(id);
    }

    public List<Lieu> findLieuxByUserId(Long userId) {
        return lieuDao.findLieuxByUserId(userId);
    }

    public Lieu save(Lieu lieu) {
        return lieuDao.save(lieu);
    }

    public Optional<Lieu> update(Long id, Lieu lieuDetails) {
        return lieuDao.findById(id)
                .map(lieu -> {
                    lieu.setNom(lieuDetails.getNom());
                    lieu.setAdresse(lieuDetails.getAdresse());
                    lieu.setVille(lieuDetails.getVille());
                    lieu.setTypeLieu(lieuDetails.getTypeLieu());
                    lieu.setDescription(lieuDetails.getDescription());
                    return lieuDao.save(lieu);
                });
    }

    public boolean deleteById(Long id) {
        if (lieuDao.existsById(id)) {
            lieuDao.deleteById(id);
            return true;
        }
        return false;
    }
}
