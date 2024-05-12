package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.FilmDao;
import com.takima.backskeleton.models.Film;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FilmService {
    private final FilmDao filmDao;

    public List<Film> findAll() {
        Iterable<Film> it = filmDao.findAll();
        List <Film> films = new ArrayList<>();
        it.forEach(films::add);
        return films;
    }

    public Optional<Film> findById(Long id) {
        return filmDao.findById(id);
    }

    public Optional<Film> update(Long id, Film filmDetails) {
        return filmDao.findById(id)
                .map(film -> {
                    film.setNomFilm(filmDetails.getNomFilm());
                    film.setGenre(filmDetails.getGenre());
                    film.setLangue(filmDetails.getLangue());
                    film.setSynopsis(filmDetails.getSynopsis());
                    return filmDao.save(film);
                });
    }

    public List<Film> getFilmsByUserId(Long userId) {
        return filmDao.findFilmsByUserId(userId);
    }

    public Film save(Film film) {
        return filmDao.save(film);
    }

    public boolean deleteById(Long id) {
        if (filmDao.existsById(id)) {
            filmDao.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
