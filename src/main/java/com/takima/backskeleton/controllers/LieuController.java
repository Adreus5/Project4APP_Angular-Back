package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.services.LieuService;
import lombok.RequiredArgsConstructor;
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

}
