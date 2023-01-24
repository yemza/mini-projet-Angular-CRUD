package com.miniprojetAngularCRUD.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojetAngularCRUD.Entities.Utilisateur;

public interface UtilisateurRespository extends JpaRepository<Utilisateur, Long> {

}
