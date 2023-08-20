package com.JNZ.project.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.JNZ.project.entities.DepartementEntity;

@RepositoryRestResource(path = "rest")
public interface DepartementRepository extends JpaRepository<DepartementEntity, Long> {
    // Vous pouvez ajouter des méthodes personnalisées de requête ici si nécessaire
	List<DepartementEntity> findByNomDepartement(String nomDepartement);

	List<DepartementEntity> findByNomDepartementContains(String nomDepartement);

}
