package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.NoteFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface NoteFilmDao extends JpaRepository<NoteFilm, Long> {
    Optional<NoteFilm> findByUtilisateurIdAndFilmId(Long utilisateurId, Long filmId);
    List<NoteFilm> findAllByFilmId(Long filmId);
}
