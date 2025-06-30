package com.cheikh.gestionimmo_backend.web;

import com.cheikh.gestionimmo_backend.entities.Proprietaire;
import com.cheikh.gestionimmo_backend.services.ProprietaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Proprietaire> getAll() {
        return proprietaireService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proprietaire> getById(@PathVariable Long id) {
        Proprietaire p = proprietaireService.getById(id);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proprietaire> update(@PathVariable Long id, @RequestBody Proprietaire nouveau) {
        Proprietaire updated = proprietaireService.modifierProprietaire(id, nouveau);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        proprietaireService.supprimerProprietaire(id);
        return ResponseEntity.noContent().build();
    }
}
