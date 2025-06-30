package com.cheikh.gestionimmo_backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompteDeGerance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String libelle;

    private double montant;

    private LocalDate dateOperation;

    @ManyToOne
    @JoinColumn(name = "immeuble_id")
    private Immeuble immeuble;
}
