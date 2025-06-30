package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import com.cheikh.gestionimmo_backend.repository.ImmeubleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

}
