package com.example.projetpfa.service;

import com.example.projetpfa.dao.entities.Admin;
import com.example.projetpfa.dao.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminManager{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin register(Admin admin){
        return adminRepository.save(admin);
    }
}
