package dev.sgpwebapi.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
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

}
