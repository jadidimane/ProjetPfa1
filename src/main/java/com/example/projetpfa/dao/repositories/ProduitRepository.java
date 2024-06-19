package com.example.projetpfa.dao.repositories;

import com.example.projetpfa.dao.entities.Categorie;
import com.example.projetpfa.dao.entities.Panier;
import com.example.projetpfa.dao.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    List<Produit> findByCategorie(Categorie categorie);
    List<Produit> findByDesignationContains(String keyword);

}
