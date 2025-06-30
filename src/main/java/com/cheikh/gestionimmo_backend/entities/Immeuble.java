package com.cheikh.gestionimmo_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Immeuble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImmeuble;
    private String nom;
    private String adresse;

    @ManyToOne
    @JoinColumn(name = "idProprietaire")
    private Proprietaire proprietaire;

    @OneToMany(mappedBy = "immeuble", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Local> locaux;

    public Immeuble(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }
}
