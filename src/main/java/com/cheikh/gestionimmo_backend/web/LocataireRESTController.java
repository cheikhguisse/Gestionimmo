package com.cheikh.gestionimmo_backend.web;
import com.cheikh.gestionimmo_backend.entities.Locataire;
import com.cheikh.gestionimmo_backend.services.LocataireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locataires")  // L'URL de base pour accéder aux locataires
@CrossOrigin("*") // Autorise les appels depuis n'importe quel frontend
public class LocataireRESTController {

    private final LocataireService locataireService;

    public LocataireRESTController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }

    @GetMapping
    public List<Locataire> getAllLocataires() {
        return locataireService.getAllLocataires();
    }
}
