package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Film")
@Getter
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Film")
    private Long id;
    @Column(name = "Nom_Film")
    private String nomFilm;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Langue")
    private String langue;
    @Column(name = "Synopsis")
    private String synopsis;
    @ManyToMany(mappedBy = "films")
    @JsonIgnore
    private List<User> utilisateurs;

}

