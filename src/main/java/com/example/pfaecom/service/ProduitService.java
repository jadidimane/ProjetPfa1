package com.example.projetpfa.service;

import com.example.projetpfa.dao.entities.Categorie;
import com.example.projetpfa.dao.entities.Produit;
import com.example.projetpfa.dao.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService implements ProduitManager{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit ajouterProduit(Produit produit){
        return produitRepository.save(produit);
    }
    @Override
    public Produit modifierProduit(Produit produit){
        return produitRepository.save(produit);
    }
    @Override
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }
    @Override
    public void delete(Produit produit){
        try {
            produitRepository.delete(produit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Produit> findByKeyword(String keyword){
        return produitRepository.findByDesignationContains(keyword);
    }
    @Override
    public List<Produit> findByCategorie(Categorie categorie){
        return produitRepository.findByCategorie(categorie);
    }

}
