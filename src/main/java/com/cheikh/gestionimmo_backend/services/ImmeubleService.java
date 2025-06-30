package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Immeuble;

import java.util.List;

public interface ImmeubleService {

    List<Immeuble> getAllImmeubles();

    Immeuble saveImmeuble(Immeuble immeuble);
    Immeuble getImmeubleById(Long id);

    Immeuble updateImmeuble(Long id, Immeuble updated);
    void deleteImmeuble(Long id);

}
