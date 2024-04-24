package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LieuDao extends JpaRepository<Lieu, Long> {
    @Query("SELECT l FROM Lieu l JOIN l.noteLieus nl WHERE nl.utilisateur.id = :userId")
    List<Lieu> findLieuxByUserId(@Param("userId") Long userId);

}
