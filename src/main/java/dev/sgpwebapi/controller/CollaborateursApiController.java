package dev.sgpwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.sgpwebapi.entity.Collaborateur;
import dev.sgpwebapi.repository.CollaborateurRepository;

/**
* API Collaborateurs
* 
* @author Sandra Le Thiec
*
*/
@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateursApiController {
	
	@Autowired
	private CollaborateurRepository collabRepo;

	@GetMapping
	public List<Collaborateur> listercollaborateurs() {
		return this.collabRepo.findAll();
	}

}
