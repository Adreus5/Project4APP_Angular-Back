package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Film")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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

    @OneToMany(mappedBy = "film")
    @JsonBackReference
    private List<NoteFilm> noteFilms;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<User> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<User> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public List<NoteFilm> getNoteFilms() {
        return noteFilms;
    }

    public void setNoteFilms(List<NoteFilm> noteFilms) {
        this.noteFilms = noteFilms;
    }
}
