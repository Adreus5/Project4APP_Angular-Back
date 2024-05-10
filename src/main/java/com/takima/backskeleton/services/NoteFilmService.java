package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.NoteFilmDao;
import com.takima.backskeleton.models.NoteFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class NoteFilmService {
    @Autowired
    private NoteFilmDao noteFilmDao;

    public Optional<NoteFilm> findByUserAndFilm(Long utilisateurId, Long filmId) {
        return noteFilmDao.findByUtilisateurIdAndFilmId(utilisateurId, filmId);
    }

    public List<NoteFilm> findAllByFilmId(Long filmId) {
        return noteFilmDao.findAllByFilmId(filmId);
    }

    public NoteFilm addNoteToFilm(NoteFilm noteFilm) {
        return noteFilmDao.save(noteFilm);
    }

    public NoteFilm updateNoteToFilm(NoteFilm noteFilm) {
        return noteFilmDao.save(noteFilm);
    }
}
