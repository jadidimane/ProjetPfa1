package com.example.projetpfa.service;

import com.example.projetpfa.SoldOutException;
import com.example.projetpfa.dao.entities.Panier;
import com.example.projetpfa.dao.entities.Produit;
import com.example.projetpfa.dao.repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierService implements PanierManager {
    @Autowired
    PanierRepository panierRepository;
    @Override
    public void ajouterAuPanier(Produit produit) throws SoldOutException {
        Panier panier =new Panier();
        if(produit.getQuantity()>produit.getOrderedQuantity()){
            if(produit.getOrderedQuantity()==0){
                panier.getProduits().add(produit);
                panier.setProduits(panier.getProduits());
                produit.setOrderedQuantity(1);
                produit.setQuantity((produit.getQuantity()-1));}
            else{
                produit.setOrderedQuantity(produit.getOrderedQuantity()+1);
            }
        }
        else{
            throw new SoldOutException("Vous pouvez commander "+produit.getQuantity());
        }
    }
    @Override
    public void supprimerDuPanier(Produit produit){
        Panier panier=new Panier();
        if(produit.getOrderedQuantity()==0){
            panier.getProduits().remove(produit);
        }
        else{
            produit.setOrderedQuantity((produit.getOrderedQuantity()-1));
            produit.setQuantity(produit.getQuantity()+1);
        }
    }
    }
