package dev.sgpwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import dev.sgpwebapi.entity.Collaborateur;
import dev.sgpwebapi.repository.CollaborateurRepository;
import org.json.*;

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
	
	@GetMapping("/departement/{id}")
	public List<Collaborateur> listercollaborateursParDepartement(@PathVariable("id") int id) {
		return this.collabRepo.findByDepartementId(id);
	}
	
	@GetMapping("/{matricule}")
	public List<Collaborateur> listercollaborateursParMatricule(@PathVariable("matricule") String matricule) {
		return this.collabRepo.findByMatricule(matricule);
	}
	
	@GetMapping("/{matricule}/banque")
	public String listercollaborateursBanqueParMatricule(@PathVariable("matricule") String matricule) {
		List<Collaborateur> collabs = this.collabRepo.findBanqueByMatricule(matricule);
		ObjectMapper mapper = new ObjectMapper();
		String jsonString ="";
		String jsonStr ="";
		String[] jsonStringSplit;
		String[] jsonStringSplit1;
		String[] jsonStringSplit2;
	
		try {
			jsonString = mapper.writeValueAsString(collabs.get(0));
			jsonStringSplit = jsonString.split("\",\"");
			jsonStringSplit1 = jsonStringSplit[0].split("\"");
			jsonStringSplit2 = jsonStringSplit[2].split("\"");
			jsonStr = "[{\"Banque\": \"" + jsonStringSplit1[1]
					+ "\", \"Bic\": \"" + jsonStringSplit[1]
					+ "\", \"Ban\": \""+ jsonStringSplit2[0] +"\"}]";
			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonStr;
	}
	
	@PutMapping("/{matricule}")
	public @ResponseBody Collaborateur modifiercollaborateursParMatricule(@PathVariable("matricule") String matricule, @RequestBody Collaborateur collab) {
		Collaborateur collabModif = this.collabRepo.findByMatricule(matricule).get(0);
		collabModif.setActif(collab.getActif());
		collabModif.setAdresse(collab.getAdresse());
		collabModif.setBan(collab.getBan());
		collabModif.setBanque(collab.getBanque());
		collabModif.setBic(collab.getBic());
		collabModif.setCivilite(collab.getCivilite());
		collabModif.setEmailPro(collab.getEmailPro());
		collabModif.setIntitulePoste(collab.getIntitulePoste());
		collabModif.setNom(collab.getNom());
		collabModif.setNumSecuSocial(collab.getNumSecuSocial());
		collabModif.setPhoto(collab.getPhoto());
		collabModif.setPrenom(collab.getPrenom());
		
		return collabModif;
	}
	

}
