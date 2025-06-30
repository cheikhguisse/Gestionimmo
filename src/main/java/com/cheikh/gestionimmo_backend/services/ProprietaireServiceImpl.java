package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Proprietaire;
import com.cheikh.gestionimmo_backend.repository.ProprietaireRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProprietaireServiceImpl implements ProprietaireService {

    @Autowired
    private  ProprietaireRepository proprietaireRepository;

    @Override
    public Proprietaire ajouterProprietaire(Proprietaire proprietaire) {
        // Ton code ici (par exemple, appel au repository)
        return proprietaireRepository.save(proprietaire);
    }

}
