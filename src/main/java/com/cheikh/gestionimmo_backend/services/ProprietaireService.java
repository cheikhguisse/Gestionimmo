package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Proprietaire;

import java.util.List;

public interface ProprietaireService {
    Proprietaire ajouterProprietaire(Proprietaire p);
    List<Proprietaire> getAll();
    Proprietaire getById(Long id);
    void supprimerProprietaire(Long id);
    Proprietaire modifierProprietaire(Long id, Proprietaire nouveau);
}
