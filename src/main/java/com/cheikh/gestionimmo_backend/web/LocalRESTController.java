package com.cheikh.gestionimmo_backend.web;


import com.cheikh.gestionimmo_backend.entities.Local;
import com.cheikh.gestionimmo_backend.services.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gestion_immo/api/local")
@CrossOrigin
public class LocalRESTController {

    @Autowired
    LocalService localService;

    @GetMapping("/all")
    public List<Local> getAllLocal() {
        return localService.getAllLocal();
    }
}
