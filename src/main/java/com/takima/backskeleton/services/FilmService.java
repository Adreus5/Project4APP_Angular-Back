package com.takima.backskeleton.services;
import com.takima.backskeleton.DAO.FilmDao;
import com.takima.backskeleton.models.Film;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.takima.backskeleton.models.NoteFilm;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FilmService {

    private final FilmDao filmDao;

    public List<Film> findAll() {
        return filmDao.findAll();
    }
    public void saveNoteFilm(NoteFilm noteFilm) {
        filmDao.save(noteFilm);
    }

    public List<Film> getFilmsByUserId(Long userId) {
        return filmDao.findFilmsByUserId(userId);
    }

    public void deleteById(Long id) {
        filmDao.deleteById(id);
    }

}
