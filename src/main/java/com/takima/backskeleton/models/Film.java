package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "Film")
@Getter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Film {
    // Getters et setters
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Film")
    private Long id;
    @Setter
    @Getter
    @Column(name = "Nom_Film")
    private String nomFilm;
    @Setter
    @Getter
    @Column(name = "Genre")
    private String genre;
    @Setter
    @Getter
    @Column(name = "Langue")
    private String langue;
    @Setter
    @Getter
    @Column(name = "Realisateur")
    private String realisateur;
    @Setter
    @Getter
    @Column(name = "Synopsis")
    private String synopsis;
    @ManyToMany(mappedBy = "films")
    @JsonIgnore
    private List<User> utilisateurs;

    @OneToMany(mappedBy = "film")
    @JsonBackReference
    private List<NoteFilm> noteFilms;


}

