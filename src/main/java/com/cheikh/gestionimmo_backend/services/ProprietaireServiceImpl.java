package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Proprietaire;
import com.cheikh.gestionimmo_backend.repository.ProprietaireRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProprietaireServiceImpl implements ProprietaireService {

    @Autowired
    private  ProprietaireRepository proprietaireRepository;

    @Override
    public Proprietaire ajouterProprietaire(Proprietaire proprietaire) {
        // Ton code ici (par exemple, appel au repository)
        return proprietaireRepository.save(proprietaire);
    }
    @Override
    public List<Proprietaire> getAll() {
        return proprietaireRepository.findAll();
    }

    @Override
    public Proprietaire getById(Long id) {
        return proprietaireRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerProprietaire(Long id) {
        proprietaireRepository.deleteById(id);
    }

    @Override
    public Proprietaire modifierProprietaire(Long id, Proprietaire nouveau) {
        return proprietaireRepository.findById(id)
                .map(p -> {
                    p.setNom(nouveau.getNom());
                    p.setPrenom(nouveau.getPrenom());
                    p.setAdresse(nouveau.getAdresse());
                    p.setEmail(nouveau.getEmail());
                    p.setTelephone(nouveau.getTelephone());
                    return proprietaireRepository.save(p);
                }).orElse(null);
    }
}
