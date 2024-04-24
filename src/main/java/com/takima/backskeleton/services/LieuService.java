package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.LieuDao;
import com.takima.backskeleton.models.Lieu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class LieuService {
    private final LieuDao lieuDao;

    public List<Lieu> findAll() {
        Iterable<Lieu> it = lieuDao.findAll();
        List <Lieu> lieux = new ArrayList<>();
        it.forEach(lieux::add);
        return lieux;
    }

    public List<Lieu> findLieuxByUserId(Long userId) {
        return lieuDao.findLieuxByUserId(userId);
    }
}
