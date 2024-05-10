package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.NoteLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface NoteLieuDao extends JpaRepository<NoteLieu, Long> {
    Optional<NoteLieu> findByUtilisateurIdAndLieuId(Long utilisateurId, Long lieuId);
    List<NoteLieu> findAllByLieuId(Long lieuId);
}
