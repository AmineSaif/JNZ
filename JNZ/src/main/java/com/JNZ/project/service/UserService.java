package com.JNZ.project.service;

import java.util.List;

import com.JNZ.project.dto.UserDTO;
import com.JNZ.project.entities.UserEntity;

public interface UserService {

    UserDTO createUser(UserDTO user);

    UserDTO updateUser(UserDTO updatedUser);

    void deleteUser(Long userId);

    UserDTO getUserById(Long userId);

    List<UserDTO> getAllUsers();

    // Ajoutez d'autres méthodes personnalisées selon vos besoins
    
    List<UserDTO> findByNomUser(String nom);

	List<UserDTO> findByNomUserContains(String nom);
	
	List<UserDTO> findByNomPrenom (String nom,String prenom);

	List<UserDTO> findByOrderByNomUserAsc();

	UserDTO convertEntityToDto(UserEntity user);

	UserEntity convertDtoToEntity(UserDTO userDTO);

}
