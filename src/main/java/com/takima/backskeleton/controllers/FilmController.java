package com.takima.backskeleton.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.takima.backskeleton.models.Film;
import com.takima.backskeleton.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.takima.backskeleton.models.NoteFilm;

import java.util.List;

@CrossOrigin
@RequestMapping("/films")
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

    @PostMapping("/films/rate")
    public ResponseEntity<?> rateFilm(@RequestBody NoteFilm noteFilm) {
        try {
            filmService.saveNoteFilm(noteFilm);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
