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
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProprietaire;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String telephone;

    @JsonIgnore
    @OneToMany(mappedBy = "proprietaire")
    private List<Immeuble> immeubles;
}
