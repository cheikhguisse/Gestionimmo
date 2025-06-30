package com.cheikh.gestionimmo_backend.repository;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import com.cheikh.gestionimmo_backend.entities.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocataireRepository extends JpaRepository<Locataire, Long> {

    List<Locataire> findByImmeuble(Immeuble immeuble);

}
