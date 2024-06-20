package com.example.projetpfa.dao.repositories;

import com.example.projetpfa.dao.entities.Categorie;
import com.example.projetpfa.dao.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categorie,Integer>{
    List<Categorie> findByTitleContains(String title);
}
