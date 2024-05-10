package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.LieuDao;
import com.takima.backskeleton.models.Lieu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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

    public List<Lieu> findLieuxByUserId(Long userId) {
        return lieuDao.findLieuxByUserId(userId);
    }

    public Optional<Lieu> getById(Long id) {
        return lieuDao.findById(id);
    }

    @Transactional
    public Lieu save(Lieu lieu) {
        return lieuDao.save(lieu);
    }

    @Transactional
    public Optional<Lieu> update(Long id, Lieu updatedLieu) {
        return getById(id).map(existingLieu -> {
            existingLieu.setNom(updatedLieu.getNom());
            existingLieu.setAdresse(updatedLieu.getAdresse());
            existingLieu.setVille(updatedLieu.getVille());
            existingLieu.setTypeLieu(updatedLieu.getTypeLieu());
            existingLieu.setDescription(updatedLieu.getDescription());
            return lieuDao.save(existingLieu);
        });
    }

    @Transactional
    public void deleteById(Long id) {
        lieuDao.deleteById(id);
    }

}
