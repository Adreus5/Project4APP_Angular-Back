package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Lieu")
@NoArgsConstructor
@Getter
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Lieu")
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Adresse")
    private String adresse;
    @Column(name = "Ville")
    private String ville;
    @Column(name = "Type_Lieu")
    private String typeLieu;
    @Column(name = "Description")
    private String description;
    @ManyToMany(mappedBy = "lieux")
    @JsonIgnore
    List<User> utilisateurs;
}