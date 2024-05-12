package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.services.LieuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.takima.backskeleton.models.NoteLieu;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin
@RequestMapping("/lieux")
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

    @PostMapping("lieux//rate")
    public ResponseEntity<?> rateLieu(@RequestBody NoteLieu noteLieu) {
        try {
            lieuService.saveNoteLieu(noteLieu);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
