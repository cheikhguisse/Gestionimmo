package com.cheikh.gestionimmo_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("STUDIO")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Studio extends Local {
    // Champs spécifiques au studio
    private int nombreDePieces;
    private String description;
    private int cuisines;
    private int toilette;

}

