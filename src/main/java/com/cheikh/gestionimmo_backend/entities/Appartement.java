package com.cheikh.gestionimmo_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("APPARTEMENT")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Appartement extends Local {
    private int nombreDePieces;
    private String description;
    private int chambre;
    private int salle;
    private int salleDeBain;
    private int toilette;
    private int cuisines;
}
