package com.miniprojetAngularCRUD.Services;

import java.util.List;

import com.miniprojetAngularCRUD.Entities.Utilisateur;

public interface UtilisateurService {

	Utilisateur addUserOrUpdate(Utilisateur utilisateur);
	void removeUser(Long idUtilisateur);
	Utilisateur getUser(Long idUtilisateur);
	List<Utilisateur> getUsers();
	

}
