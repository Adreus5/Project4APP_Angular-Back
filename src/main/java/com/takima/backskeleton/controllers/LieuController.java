package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.services.LieuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("lieux")
@RestController
@RequiredArgsConstructor
public class LieuController {
    private final LieuService lieuService;

    @GetMapping("")
    public List<Lieu> findAll() {
        return lieuService.findAll();
    }

    @GetMapping("/lieux")
    public List<Lieu> getAllLieux() {
        return lieuService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lieu> getLieuById(@PathVariable Long id) {
        return lieuService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Lieu createLieu(@RequestBody Lieu lieu) {
        return lieuService.save(lieu);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lieu> updateLieu(@PathVariable Long id, @RequestBody Lieu lieuDetails) {
        return lieuService.update(id, lieuDetails)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLieu(@PathVariable Long id) {
        boolean deleted = lieuService.deleteById(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
