package dev.sgpwebapi.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.sgpwebapi.entity.Departement;


/**
 * Repository de l'API Departement
 * @author Sandra Le Thiec
 *
 */
@Repository
@Transactional
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
