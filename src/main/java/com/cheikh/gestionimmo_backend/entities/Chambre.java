package com.cheikh.gestionimmo_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("CHAMBRE")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Chambre extends Local {
    // Tu pourras ajouter ici des champs spécifiques à Chambre si nécessaire
    private boolean salleDeBain;
}
