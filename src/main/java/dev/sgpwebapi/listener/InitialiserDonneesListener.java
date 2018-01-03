package dev.sgpwebapi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.sgpwebapi.service.InitialiserListeCollaborateursServiceDev;
import dev.sgpwebapi.service.InitialiserListeDepartementsServiceDev;

/**
 * Ecouteur pour initialiser les données dans la base au lancement de
 * l'application
 * 
 * @author Sandra Le Thiec
 *
 */
@Component
public class InitialiserDonneesListener {
	
	/* ATTRIBUTS */
	/**
	 * Service d'initialisation des données dans la base
	 */
	@Autowired	private InitialiserListeDepartementsServiceDev initialiserDepartementsServiceDev;
	@Autowired	private InitialiserListeCollaborateursServiceDev initialiserListeCollaborateursServiceDev;
	
	/* METHODES */

	@EventListener(ContextRefreshedEvent.class)
	public void contextRefreshedEvent() {
		initialiserDepartementsServiceDev.initialiser();
		initialiserListeCollaborateursServiceDev.initialiser();
	}

}
