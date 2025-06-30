package com.cheikh.gestionimmo_backend.repository;

import com.cheikh.gestionimmo_backend.entities.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartementRepository extends JpaRepository<Appartement, Long> {
}
