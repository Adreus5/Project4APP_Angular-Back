package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.NoteLieuDao;
import com.takima.backskeleton.models.NoteLieu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class NoteLieuService {
    @Autowired
    private NoteLieuDao noteLieuDao;

    public Optional<NoteLieu> findByUserAndLieu(Long utilisateurId, Long lieuId) {
        return noteLieuDao.findByUtilisateurIdAndLieuId(utilisateurId, lieuId);
    }

    public List<NoteLieu> findAllByLieuId(Long lieuId) {
        return noteLieuDao.findAllByLieuId(lieuId);
    }

    public NoteLieu addNoteToLieu(NoteLieu noteLieu) {
        return noteLieuDao.save(noteLieu);
    }

    public NoteLieu updateNoteToLieu(NoteLieu noteLieu) {
        return noteLieuDao.save(noteLieu);
    }
}
