package dev.sgpwebapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import dev.sgpwebapi.entity.Departement;
import dev.sgpwebapi.repository.DepartementRepository;

/**
 * Service d'initialisation des départements
 * @author Sandra Le Thiec
 *
 */
@Configuration
public class InitialiserListeDepartementsServiceDev implements InitialiserDonneesService{
	@Autowired DepartementRepository departementRepo;
	
	@Override
	public void initialiser() {
		Departement d1 = new Departement();
		Departement d2 = new Departement();
		Departement d3 = new Departement();
		Departement d4 = new Departement();
		d1.setNom("Comptabilié");
		d2.setNom("Ressources Humaines");
		d3.setNom("Informatique");
		d4.setNom("Administratif");
		departementRepo.save(d1);
		departementRepo.save(d2);
		departementRepo.save(d3);
		departementRepo.save(d4);
		
	}

}
