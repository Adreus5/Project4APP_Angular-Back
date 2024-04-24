package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.FilmDao;
import com.takima.backskeleton.models.Film;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public List<Film> getFilmsByUserId(Long userId) {
        return filmDao.findFilmsByUserId(userId);
    }
}
