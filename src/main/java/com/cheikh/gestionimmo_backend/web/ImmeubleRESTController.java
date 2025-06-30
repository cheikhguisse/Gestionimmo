package com.cheikh.gestionimmo_backend.web;

import com.cheikh.gestionimmo_backend.entities.Immeuble;
import com.cheikh.gestionimmo_backend.services.ImmeubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/immeubles")
@CrossOrigin("*")
public class ImmeubleRESTController {

    private final ImmeubleService immeubleService;

    @Autowired
    public ImmeubleRESTController(ImmeubleService immeubleService) {
        this.immeubleService = immeubleService;
    }

    @GetMapping
    public List<Immeuble> getAllImmeubles() {
        return immeubleService.getAllImmeubles();
    }

    @PostMapping
    public Immeuble createImmeuble(@RequestBody Immeuble immeuble) {
        return immeubleService.saveImmeuble(immeuble);
    }


}

