package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.models.NoteLieu;
import com.takima.backskeleton.services.LieuService;
import com.takima.backskeleton.services.NoteLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lieux")
public class LieuController {
    @Autowired
    private LieuService lieuService;

    @Autowired
    private NoteLieuService noteLieuService;

    @GetMapping
    public List<Lieu> findAll() {
        return lieuService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lieu> findById(@PathVariable Long id) {
        return lieuService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{lieuId}/notes/{userId}")
    public ResponseEntity<NoteLieu> getNoteByUserAndLieu(@PathVariable Long lieuId, @PathVariable Long userId) {
        return noteLieuService.findByUserAndLieu(userId, lieuId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }

    @PostMapping("/{lieuId}/notes")
    public NoteLieu addNoteToLieu(@PathVariable Long lieuId, @RequestBody NoteLieu noteLieu) {
        return noteLieuService.addNoteToLieu(noteLieu);
    }

    @PutMapping("/{lieuId}/notes")
    public NoteLieu updateNoteToLieu(@PathVariable Long lieuId, @RequestBody NoteLieu noteLieu) {
        return noteLieuService.updateNoteToLieu(noteLieu);
    }
}
