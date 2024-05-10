package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Lieu")
@NoArgsConstructor
@Getter
@Setter
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
    private List<User> utilisateurs;

    @OneToMany(mappedBy = "lieu") // Assurez-vous que l'attribut 'lieu' dans NoteLieu correspond
    private Set<NoteLieu> noteLieus;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(String typeLieu) {
        this.typeLieu = typeLieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<User> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Set<NoteLieu> getNoteLieus() {
        return noteLieus;
    }

    public void setNoteLieus(Set<NoteLieu> noteLieus) {
        this.noteLieus = noteLieus;
    }
}
