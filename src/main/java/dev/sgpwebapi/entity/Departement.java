package dev.sgpwebapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Un département
 * @author Sandra Le Thiec
 *
 */
@Entity
@Table(name="DEPARTEMENT")
public class Departement {
	
	/* ATTRIBUTS */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Un identifiant
	 */
	private int id;
	
	/**
	 * Nom du département
	 */
	@Column(name="NOM")
	private String Nom;
	
	/* CONSTRUCTEURS */
	/**
	 * Constructeur par défaut
	 */
	public Departement() {
		
	}
	
	public Departement(int id, String nom) {
			this.setId(id);
			this.setNom(nom);
	}

	
	/* GETTERS ET SETTERS */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}
}
