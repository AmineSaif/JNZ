package com.JNZ.project.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.JNZ.project.entities.UserEntity;

@RepositoryRestResource(path = "rest")
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Vous pouvez ajouter des méthodes personnalisées de requête ici si nécessaire
	List<UserEntity> findByNomUser(String nom);

	List<UserEntity> findByNomUserContains(String nom);
	
	@Query("select p from UserEntity p where p.nomUser like %:nom and p.prenomUser like  :prenom")
	List<UserEntity> findByNomPrenom (@Param("nom") String nom,@Param("prenom") String prenom);

	List<UserEntity> findByOrderByNomUserAsc();

}
