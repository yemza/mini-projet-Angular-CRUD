package com.miniprojetAngularCRUD.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojetAngularCRUD.Entities.Utilisateur;
import com.miniprojetAngularCRUD.Services.UtilisateurService;

@CrossOrigin("*")
@RestController
public class UserControler {

	@Autowired
	UtilisateurService	utilisateurService;
	
	@PostMapping("/addUser")
	public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.addUserOrUpdate(utilisateur);
	}

	@PostMapping("/updateUser")
	public Utilisateur UpdateUser(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.addUserOrUpdate(utilisateur);
	}
	
	@DeleteMapping("/removeUser")
	public void removeUser(Long idUtilisateur) {
		utilisateurService.removeUser(idUtilisateur);	
	}

	@GetMapping("/getUser")
	public Utilisateur getUser(Long idUtilisateur) {
		return utilisateurService.getUser(idUtilisateur);	
	}

	@GetMapping("/getUsers")
	public List<Utilisateur> getUsers() {
		return utilisateurService.getUsers();	
	}

}
