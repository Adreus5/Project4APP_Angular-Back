package com.takima.backskeleton.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "note_lieu")
public class NoteLieu {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_Utilisateur")
    private User utilisateur;

    @ManyToOne
    @JoinColumn(name = "ID_Lieu")
    @JsonBackReference
    private Lieu lieu;

    @Column(name = "Note")
    private Integer note;

    @Column(name = "Commentaire")
    private String commentaire;

}