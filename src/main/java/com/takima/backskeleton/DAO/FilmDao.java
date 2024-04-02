package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDao extends JpaRepository<Film, Long> {

}
