package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.takima.backskeleton.models.NoteFilm;

import java.util.List;

@Repository
public interface FilmDao extends JpaRepository<NoteFilm, Long> {

    @Query("SELECT f FROM Film f JOIN f.noteFilms nf WHERE nf.utilisateur.id = :userId")
    List<Film> findFilmsByUserId(@Param("userId") Long userId);

}
