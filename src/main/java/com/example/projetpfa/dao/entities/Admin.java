package com.example.projetpfa.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Admin {
    @Id
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String mail;
    private String tel;
    private String nomComplet;
    private String adresse;
}
