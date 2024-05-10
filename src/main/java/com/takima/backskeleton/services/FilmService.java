package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.FilmDao;
import com.takima.backskeleton.models.Film;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FilmService {
    private final FilmDao filmDao;

    public List<Film> findAll() {
        Iterable<Film> it = filmDao.findAll();
        List<Film> films = new ArrayList<>();
        it.forEach(films::add);
        return films;
    }

    public List<Film> findFilmsByUserId(Long userId) {
        return filmDao.findFilmsByUserId(userId);
    }

    public Optional<Film> getById(Long id) {
        return filmDao.findById(id);
    }


    @Transactional
    public Film save(Film film) {
        return filmDao.save(film);
    }

    @Transactional
    public Optional<Film> update(Long id, Film updatedFilm) {
        return getById(id).map(existingFilm -> {
            existingFilm.setNomFilm(updatedFilm.getNomFilm());
            existingFilm.setGenre(updatedFilm.getGenre());
            existingFilm.setLangue(updatedFilm.getLangue());
            existingFilm.setSynopsis(updatedFilm.getSynopsis());
            return filmDao.save(existingFilm);
        });
    }

    @Transactional
    public void deleteById(Long id) {
        filmDao.deleteById(id);
    }
}
