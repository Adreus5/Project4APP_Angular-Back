package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "Utilisateur")
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Utilisateur")
    private Long id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "Mail")
    private String mail;

    @Column(name = "Type_User")
    private String typeUser;

    @ManyToMany
    @JoinTable(
            name = "note_film",
            joinColumns = @JoinColumn(name = "ID_Utilisateur", nullable = true),
            inverseJoinColumns = @JoinColumn(name = "ID_Film", nullable = true))

    private List<Film> films;

    @ManyToMany
    @JoinTable(
            name = "note_lieu",
            joinColumns = @JoinColumn(name = "ID_Utilisateur", nullable = true),
            inverseJoinColumns = @JoinColumn(name = "ID_Lieu", nullable = true))

    private List<Lieu> lieux;

    public User() {
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.mail = builder.mail;
        this.typeUser = builder.typeUser;
        this.films = builder.films;
        this.lieux = builder.lieux;
    }

    public static class Builder {
        private Long id;
        private String nom;
        private String prenom;
        private String mail;
        private String typeUser;
        private List<Film> films;
        private List<Lieu> lieux;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public Builder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder typeUser(String typeUser) {
            this.typeUser = typeUser;
            return this;
        }

        public Builder films(List<Film> films) {
            this.films = films;
            return this;
        }

        public Builder lieux(List<Lieu> lieux) {
            this.lieux = lieux;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
