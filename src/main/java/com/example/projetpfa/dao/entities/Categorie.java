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
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits=new ArrayList<Produit>();

}
