package com.example.projetpfa.service;

import com.example.projetpfa.dao.entities.Categorie;
import com.example.projetpfa.dao.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements CategorieManager{
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Categorie ajouterCategorie(Categorie categorie){
        return categoryRepository.save(categorie);
    }
    @Override
    public Categorie modifierCategorie(Categorie categorie){
        return categoryRepository.save(categorie);
    }
    @Override
    public void deleteCategorie(Categorie categorie){
        try {
            categoryRepository.delete(categorie);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Categorie> findByKeyword(String keyword){
        return categoryRepository.findByTitleContains(keyword);
    }
    @Override
    public List<Categorie> getAllCategories(){
        return categoryRepository.findAll();
    }
}
