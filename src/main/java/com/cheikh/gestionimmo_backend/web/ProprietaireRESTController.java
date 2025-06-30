package com.cheikh.gestionimmo_backend.web;

import com.cheikh.gestionimmo_backend.entities.Proprietaire;
import com.cheikh.gestionimmo_backend.services.ProprietaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proprietaires")
@RequiredArgsConstructor
@CrossOrigin("*") // permet les appels depuis Angular
public class ProprietaireRESTController {

    private final ProprietaireService proprietaireService;

    @PostMapping
    public ResponseEntity<Proprietaire> ajouter(@RequestBody Proprietaire p) {
        return ResponseEntity.ok(proprietaireService.ajouterProprietaire(p));
    }
}
