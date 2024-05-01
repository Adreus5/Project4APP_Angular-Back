package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Film;
import com.takima.backskeleton.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("films")
@RestController
@RequiredArgsConstructor
public class FilmController {
    private final FilmService filmService;

    @GetMapping("")
    public List<Film> findAll() {
        return filmService.findAll();
    }

    @GetMapping("/films")
    public List<Film> getAllFilms() {
        return filmService.findAll();
    }

}
