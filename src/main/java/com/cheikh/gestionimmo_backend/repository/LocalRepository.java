package com.cheikh.gestionimmo_backend.repository;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import com.cheikh.gestionimmo_backend.entities.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalRepository extends JpaRepository<Local, Long> {

    List<Local> findByDescription(String description);
    List<Local> findAllByOrderByDescriptionAsc();
    List<Local> findByimmeuble(Long immeubleId);
}
