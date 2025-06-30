package com.cheikh.gestionimmo_backend.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeLocal", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocal;

    private String description;
    private Double prix;
    private String surface;

    @ManyToOne
    @JoinColumn(name = "cni")
    private Locataire locataire;

    @ManyToOne
    @JoinColumn(name = "id_immeuble")
    private Immeuble immeuble;
}
