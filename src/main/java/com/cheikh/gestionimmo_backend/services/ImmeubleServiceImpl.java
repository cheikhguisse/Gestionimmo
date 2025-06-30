package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import com.cheikh.gestionimmo_backend.repository.ImmeubleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImmeubleServiceImpl implements ImmeubleService {
    private final ImmeubleRepository immeubleRepository;

    @Autowired
    public ImmeubleServiceImpl(ImmeubleRepository immeubleRepository) {
        this.immeubleRepository = immeubleRepository;
    }

    @Override
    public List<Immeuble> getAllImmeubles() {
        return immeubleRepository.findAll();
    }

    @Override
    public Immeuble saveImmeuble(Immeuble immeuble) {
        return immeubleRepository.save(immeuble);
    }

    @Override
    public Immeuble getImmeubleById(Long id) {
        Optional<Immeuble> immeuble = immeubleRepository.findById(id);
        return immeuble.orElse(null); // ou lancer une exception personnalisée si introuvable
    }

    @Override
    public Immeuble updateImmeuble(Long id, Immeuble updated) {
        return immeubleRepository.findById(id)
                .map(existing -> {
                    existing.setNom(updated.getNom());
                    existing.setAdresse(updated.getAdresse());
                    existing.setProprietaire(updated.getProprietaire());
                    // Tu peux ajouter les autres champs à mettre à jour ici
                    return immeubleRepository.save(existing);
                })
                .orElse(null); // ou lancer une exception si l'immeuble n'existe pas
    }

    @Override
    public void deleteImmeuble(Long id) {
        immeubleRepository.deleteById(id);
    }

}
