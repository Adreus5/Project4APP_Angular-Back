package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LieuDao extends JpaRepository<Lieu, Long> {

}
