package com.example.projetpfa.service;

import com.example.projetpfa.SoldOutException;
import com.example.projetpfa.dao.entities.Produit;

public interface PanierManager {
    void ajouterAuPanier(Produit produit) throws SoldOutException;

    void supprimerDuPanier(Produit produit);
}
