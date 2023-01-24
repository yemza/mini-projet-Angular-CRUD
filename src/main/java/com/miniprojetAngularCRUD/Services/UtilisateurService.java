package com.miniprojetAngularCRUD.Services;

import java.util.List;

import com.miniprojetAngularCRUD.Entities.Utilisateur;

public interface UtilisateurService {

	Utilisateur addUser(Utilisateur utilisateur);
	Utilisateur updateUser(Utilisateur utilisateur);
	void removeUser(Long idUtilisateur);
	Utilisateur getUser(Long idUtilisateur);
	List<Utilisateur> getUsers();
	

}
