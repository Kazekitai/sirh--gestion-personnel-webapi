package dev.sgpwebapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.sgpwebapi.entity.Departement;
import dev.sgpwebapi.repository.DepartementRepository;


/**
* API Départements
* 
* @author Sandra Le Thiec
*
*/
@RestController
@RequestMapping("/api/departements")
public class DepartementsApiController {
	
	@Autowired
	private DepartementRepository departementRepo;

	@GetMapping
	public List<Departement> listerdepartements() {
		return this.departementRepo.findAll();
	}

}
