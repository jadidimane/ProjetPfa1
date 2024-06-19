package com.example.projetpfa.service;

import com.example.projetpfa.dao.entities.Categorie;
import com.example.projetpfa.dao.entities.Produit;

import java.util.List;

public interface ProduitManager {
    Produit ajouterProduit(Produit produit);

    Produit modifierProduit(Produit produit);

    List<Produit> listProduits();

    void delete(Produit produit);

    List<Produit> findByKeyword(String keyword);

    List<Produit> findByCategorie(Categorie categorie);
}
