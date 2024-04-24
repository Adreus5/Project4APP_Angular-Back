package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Film;
import com.takima.backskeleton.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Film>> getFilmsByUserId(@PathVariable Long userId) {
        List<Film> films = filmService.getFilmsByUserId(userId);
        return ResponseEntity.ok(films);
    }
}
