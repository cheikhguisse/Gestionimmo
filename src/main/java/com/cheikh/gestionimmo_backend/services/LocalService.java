package com.cheikh.gestionimmo_backend.services;

import com.cheikh.gestionimmo_backend.entities.Local;
import com.cheikh.gestionimmo_backend.entities.Locataire;

import java.util.List;

public interface LocalService {

    Local saveLocal(Local l);

    Local updateLocal(Local l);

    void deleteLocal(Local l);

    void deleteLocalByIdLocal(Long idLocal);

    void deleteLocalById(Long idLocal);

    Local getLocal(Long idLocal);

    List<Local> getAllLocal();
    List<Local> findByDescriptionLocal(String description);
    List<Local> findByDescriptionLocalSurface(String Description);
    List<Local> findByDescriptionPrix (String Description, Double prix);
    List<Local> findByLocataire (Locataire locataire);
    List<Local> findByLocataireCni(Long cni);
    List<Local> findByOrderByDescriptionLocalAsc();
    List<Local> trierLocalDescriptionPrix();
    List<Local> findByTypeLocal(String typeLocal);

}
