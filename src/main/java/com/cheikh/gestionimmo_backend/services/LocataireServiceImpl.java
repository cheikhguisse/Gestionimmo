package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Locataire;
import com.cheikh.gestionimmo_backend.repository.LocataireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocataireServiceImpl implements LocataireService {

    private final LocataireRepository locataireRepository;

    public LocataireServiceImpl(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    @Override
    public List<Locataire> getAllLocataires() {
        return locataireRepository.findAll();
    }
}
