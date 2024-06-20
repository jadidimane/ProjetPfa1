package com.example.projetpfa.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String designation;
    private Integer quantity;
    private Integer orderedQuantity;
    private Double prixUnitaire;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Panier panier;

}
