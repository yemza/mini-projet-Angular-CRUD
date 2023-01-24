package com.miniprojetAngularCRUD.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojetAngularCRUD.Entities.Utilisateur;
import com.miniprojetAngularCRUD.Respository.UtilisateurRespository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	UtilisateurRespository utilisateurRespository;

	@Override
	public Utilisateur addUserOrUpdate(Utilisateur utilisateur) {
		return utilisateurRespository.save(utilisateur);
	}


	@Override
	public void removeUser(Long idUtilisateur) {
		utilisateurRespository.deleteById(idUtilisateur);
		
	}

	@Override
	public Utilisateur getUser(Long idUtilisateur) {
		return utilisateurRespository.findById(idUtilisateur).get();
	}

	@Override
	public List<Utilisateur> getUsers() {
		return utilisateurRespository.findAll();
	}

}
