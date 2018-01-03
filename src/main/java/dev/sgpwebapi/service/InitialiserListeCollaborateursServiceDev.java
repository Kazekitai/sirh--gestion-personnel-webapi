package dev.sgpwebapi.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import dev.sgpwebapi.entity.Collaborateur;
import dev.sgpwebapi.entity.Departement;
import dev.sgpwebapi.repository.CollaborateurRepository;
import dev.sgpwebapi.repository.DepartementRepository;

/**
 * Service d'initialisation des collaborateurs
 * @author Sandra Le Thiec
 *
 */
@Configuration
public class InitialiserListeCollaborateursServiceDev  implements InitialiserDonneesService {

@Autowired CollaborateurRepository collabRepo;
@Autowired DepartementRepository deptRepo;
	
	@Override
	public void initialiser() {
		// Initialiser la liste des collaborateurs
				List<Departement> departements = deptRepo.findAll();
				List<Collaborateur> collaborateurs = collabRepo.findAll();
				Collaborateur collab1 = new Collaborateur();
				collab1.setCivilite("Mr");
				collab1.setNom("César");
				collab1.setPrenom("Jules");
				collab1.setAdresse("4 rue Edith Piaf, 44800 Saint-Herblain");
				collab1.setDateNaissance(LocalDate.of(1985, 10, 14));
				collab1.setDepartement((Departement) departements.stream().filter(d -> d.getNom().equals("Ressources Humaines"))
						.collect(Collectors.toList()).get(0));
				collab1.setEmailPro("Jules.César@societe.com");
				collab1.setIntitulePoste("Directeur");
				collab1.setMatricule("M" + collaborateurs.size());
				collab1.setNumSecuSocial("123456789123456");
				collab1.setPhoto("https://bootdey.com/img/Content/user_1.jpg");
				collab1.setBanque("Caisse d'Epargne");
				collab1.setBan("BAN1254536544");
				collab1.setBic("BIC5233554412");
				collaborateurs.add(collab1);

				Collaborateur collab2 = new Collaborateur();
				collab2.setNom("Bono");
				collab2.setPrenom("Jean");
				collab2.setCivilite("Mr");
				collab2.setActif(false);
				collab2.setAdresse("4 rue Edith Piaf, 44800 Saint-Herblain");
				collab2.setDateNaissance(LocalDate.of(1985, 11, 25));
				collab2.setDepartement((Departement) departements.stream().filter(d -> d.getNom().equals("Informatique"))
						.collect(Collectors.toList()).get(0));
				collab2.setEmailPro("Jean.Bono@societe.com");
				collab2.setIntitulePoste("Développeur");
				collab2.setMatricule("M" + collaborateurs.size());
				collab2.setNumSecuSocial("123456789123456");
				collab2.setPhoto("https://bootdey.com/img/Content/user_1.jpg");
				collab2.setBanque("Caisse d'Epargne");
				collab2.setBan("BAN8545669845");
				collab2.setBic("BIC8545669845");
				collaborateurs.add(collab2);
				
				Collaborateur collab3 = new Collaborateur();
				collab3.setCivilite("Mme");
				collab3.setNom("Smith");
				collab3.setPrenom("Lucie");
				collab3.setActif(true);
				collab3.setAdresse("4 rue Edith Piaf, 44800 Saint-Herblain");
				collab3.setDateNaissance(LocalDate.of(1980, 11, 01));
				collab3.setDepartement((Departement) departements.stream().filter(d -> d.getNom().equals("Informatique"))
						.collect(Collectors.toList()).get(0));
				collab3.setEmailPro("Lucie.Smith@societe.com");
				collab3.setIntitulePoste("Développeuse");
				collab3.setMatricule("M" + collaborateurs.size());
				collab3.setNumSecuSocial("123456789123456");
				collab3.setPhoto("https://bootdey.com/img/Content/user_2.jpg");
				collab3.setBanque("La Banque Postale");
				collab3.setBan("BAN62547899551");
				collab3.setBic("BIC62547899551");
				collaborateurs.add(collab3);
				
				Collaborateur collab4 = new Collaborateur();
				collab4.setCivilite("Mme");
				collab4.setNom("Sim");
				collab4.setPrenom("Sophie");
				collab4.setActif(false);
				collab4.setAdresse("4 rue Edith Piaf, 44800 Saint-Herblain");
				collab4.setDateNaissance(LocalDate.of(1985, 06, 12));
				collab4.setDepartement((Departement) departements.stream().filter(d -> d.getNom().equals("Comptabilié"))
						.collect(Collectors.toList()).get(0));
				collab4.setEmailPro("Sophie.Sim@societe.com");
				collab4.setIntitulePoste("Secrétaire");
				collab4.setMatricule("M" + collaborateurs.size());
				collab4.setNumSecuSocial("123456789123456");
				collab4.setPhoto("https://bootdey.com/img/Content/user_2.jpg");
				collab4.setBanque("La Banque Postale");
				collab4.setBan("BAN233356254");
				collab4.setBic("BIC233356254");
				collaborateurs.add(collab4);
				
				collabRepo.save(collab1);
				collabRepo.save(collab2);
				collabRepo.save(collab3);
				collabRepo.save(collab4);
		
	}

}
