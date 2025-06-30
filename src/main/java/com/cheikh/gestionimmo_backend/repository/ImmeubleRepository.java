package com.cheikh.gestionimmo_backend.repository;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmeubleRepository extends JpaRepository<Immeuble, Long> {
}
