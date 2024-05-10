package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Film;
import com.takima.backskeleton.models.NoteFilm;
import com.takima.backskeleton.services.FilmService;
import com.takima.backskeleton.services.NoteFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @Autowired
    private NoteFilmService noteFilmService;

    @GetMapping
    public List<Film> findAll() {
        return filmService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> findById(@PathVariable Long id) {
        return filmService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{filmId}/notes/{userId}")
    public ResponseEntity<NoteFilm> getNoteByUserAndFilm(@PathVariable Long filmId, @PathVariable Long userId) {
        return noteFilmService.findByUserAndFilm(userId, filmId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }

    @PostMapping("/{filmId}/notes")
    public NoteFilm addNoteToFilm(@PathVariable Long filmId, @RequestBody NoteFilm noteFilm) {
        return noteFilmService.addNoteToFilm(noteFilm);
    }

    @PutMapping("/{filmId}/notes")
    public NoteFilm updateNoteToFilm(@PathVariable Long filmId, @RequestBody NoteFilm noteFilm) {
        return noteFilmService.updateNoteToFilm(noteFilm);
    }
}
