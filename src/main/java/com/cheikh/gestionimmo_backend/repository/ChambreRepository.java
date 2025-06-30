package com.cheikh.gestionimmo_backend.repository;

import com.cheikh.gestionimmo_backend.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
