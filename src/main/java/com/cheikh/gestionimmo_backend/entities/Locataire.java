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
public class Locataire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cni;
    private String prenom;
    private String nom;
    private String telephone;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "locataire")
    private List<Local> locals;

    @ManyToOne
    @JoinColumn(name = "idImmeuble")
    private Immeuble immeuble;
}
