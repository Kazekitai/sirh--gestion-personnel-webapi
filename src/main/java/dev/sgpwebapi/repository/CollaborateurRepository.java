package dev.sgpwebapi.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import dev.sgpwebapi.entity.Collaborateur;

/**
 * Repository de l'API Collaborateurs
 * @author Sandra Le Thiec
 *
 */
@Repository
@Transactional
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {
	List<Collaborateur> findByDepartementId(int idDepartement);
	List<Collaborateur> findByMatricule(String matricule);
	List<Collaborateur> findByNom(String nom);
	
	@Query("select c.banque, c.bic, c.ban from Collaborateur c where c.matricule = :matricule")
	List<Collaborateur> findBanqueByMatricule(@Param("matricule") String matricule);

}
