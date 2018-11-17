package com.project.simplon.repository;
import com.project.simplon.model.Annonce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long> {

}