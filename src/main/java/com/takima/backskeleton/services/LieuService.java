package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.LieuDao;
import com.takima.backskeleton.models.Lieu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.takima.backskeleton.models.NoteLieu;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class LieuService {
    private final LieuDao lieuDao;

    public List<Lieu> findAll() {
        return lieuDao.findAll();
    }

    public void saveNoteLieu(NoteLieu noteLieu) {
        lieuDao.save(noteLieu);
    }


    public List<Lieu> findLieuxByUserId(Long userId) {
        return lieuDao.findLieuxByUserId(userId);
    }

    public void deleteById(Long id) {
        lieuDao.deleteById(id);
    }

}
