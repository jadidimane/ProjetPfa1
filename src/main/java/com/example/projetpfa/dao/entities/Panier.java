package com.example.projetpfa.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer nbArticles;
    private float montantTotal;
    @OneToMany(mappedBy = "panier")
    private List<Produit> produits=new ArrayList<Produit>();
}
