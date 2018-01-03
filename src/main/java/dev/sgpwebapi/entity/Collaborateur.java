package dev.sgpwebapi.entity;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
* Un Collaborateur
* @author Sandra Le Thiec
*
*/
@Entity
@Table(name="COLLABORATEUR")
public class Collaborateur {
/* ATTRIBUTS */
	
	/**
	 * Un identifiant de base
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	/**
	 * Un matricule
	 */
	@Column(name="MATRICULE")
	private String matricule;
	
	/**
	 * Un nom
	 */
	@Column(name="NOM")
	private String nom;
	
	/**
	 * Un prénom
	 */
	@Column(name="PRENOM")
	private String prenom;
	
	/**
	 * Une date de naissance
	 */
	@Column(name="DATE_DE_NAISSANCE")
	private LocalDate dateNaissance;
	
	/**
	 * Une adresse
	 */
	@Column(name="ADRESSE")
	private String adresse;
	
	/**
	 * Un numéro de sécurité sociale
	 */
	@Column(name="NUM_SECU_SOCIALE")
	private String numSecuSocial;
	
	/**
	 * Un email professionnel
	 */
	@Column(name="EMAIL_PRO")
	private String emailPro;
	
	/**
	 * L'adresse d'une photo
	 */
	@Column(name="PHOTO")
	private String photo;
	
	/**
	 * Une date de création
	 */
	@Column(name="DATE_CREATION")
	private ZonedDateTime dateHeureCreation;
	
	/**
	 * Un attribut indiquant si le collaborateur est actif (true) ou non (false)
	 */
	@Column(name="EST_ACTIF")
	private Boolean actif;
	
	/**
	 * L'intitulé du poste
	 */
	@Column(name="POSTE")
	private String intitulePoste;
	
	/**
	 * Département du poste
	 */
	@ManyToOne
	@JoinColumn(name="DEPARTEMENT_ID")
	private Departement departement;
	
	/**
	 * Civilité du collaborateur
	 */
	@Column(name="CIVILITE")
	private String civilite;
	
	/**
	 * Une banque
	 */
	@Column(name="BANQUE")
	private String banque;
	
	/**
	 * Un bic
	 */
	@Column(name="BIC")
	private String bic;
	
	/**
	 * Un ban
	 */
	@Column(name="BAN")
	private String ban;
	
	
	
	/* CONSTRUCTEUR */
	
	/**
	 * Constructeur par défaut
	 */
	public Collaborateur() {
		this.setDateHeureCreation(ZonedDateTime.now());
		this.setActif(true);
		this.setPhoto("https://bootdey.com/img/Content/user_1.jpg");
	}
	
	/* GETTERS ET SETTERS */
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/**
	 * @param intitulePoste the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	/**
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numSecuSocial
	 */
	public String getNumSecuSocial() {
		return numSecuSocial;
	}

	/**
	 * @param numSecuSocial the numSecuSocial to set
	 */
	public void setNumSecuSocial(String numSecuSocial) {
		this.numSecuSocial = numSecuSocial;
	}

	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	/**
	 * @return the banque
	 */
	public String getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(String banque) {
		this.banque = banque;
	}

	/**
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * @param bic the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}

	/**
	 * @return the ban
	 */
	public String getBan() {
		return ban;
	}

	/**
	 * @param ban the ban to set
	 */
	public void setBan(String ban) {
		this.ban = ban;
	}

}
