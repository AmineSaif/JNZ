package com.JNZ.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JNZ.project.dto.UserDTO;
import com.JNZ.project.entities.UserEntity;
import com.JNZ.project.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO user) {
        return convertEntityToDto(userRepository.save(convertDtoToEntity(user)));
    }

    @Override
    public UserDTO updateUser(UserDTO updatedUser) {
            return convertEntityToDto(userRepository.save(convertDtoToEntity(updatedUser)));
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        return convertEntityToDto(userRepository.findById(userId).orElse(null));
    }

    @Override
    public List<UserDTO> getAllUsers() {
    	return userRepository.findAll().stream()
    			.map(this::convertEntityToDto)
    			.collect(Collectors.toList());
    }

	@Override
	public List<UserDTO> findByNomUser(String nom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomUser(nom).stream()
    			.map(this::convertEntityToDto)
    			.collect(Collectors.toList());
	}

	@Override
	public List<UserDTO> findByNomUserContains(String nom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomUserContains(nom).stream()
    			.map(this::convertEntityToDto)
    			.collect(Collectors.toList());
	}

	@Override
	public List<UserDTO> findByNomPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomPrenom(nom, prenom).stream()
    			.map(this::convertEntityToDto)
    			.collect(Collectors.toList());
	}

	@Override
	public List<UserDTO> findByOrderByNomUserAsc() {
		// TODO Auto-generated method stub
		return userRepository.findByOrderByNomUserAsc().stream()
    			.map(this::convertEntityToDto)
    			.collect(Collectors.toList());
	}

    // Ajoutez d'autres méthodes personnalisées selon vos besoins
    
	@Override
	public UserDTO convertEntityToDto(UserEntity user) {
		    //UserDTO userDTO = new UserDTO();
		    /*userDTO.setIdUser(user.getIdUser());
		    userDTO.setCO_NO(user.getCO_NO());
		    userDTO.setNomUser(user.getNom());
		    userDTO.setPrenomUser(user.getPrenom());
		    userDTO.setIdProfil(user.getIdProfil());
		    userDTO.setActif(user.getActif());
		    userDTO.setLogin(user.getLogin());
		    userDTO.setMotPasse(user.getMotPasse());
		    userDTO.setIdDepartement(user.getIdDepartement());
		    userDTO.setToutDocument(user.getToutDocument());
		    userDTO.setUpdatePassword(user.getUpdatePassword());
		    return userDTO;*/
		    /*return UserDTO.builder()
		            .idUser(user.getIdUser())
		            .CO_NO(user.getCO_NO())
		            .nomUser(user.getNom())
		            .prenomUser(user.getPrenom())
		            .idProfil(user.getIdProfil())
		            .Actif(user.getActif())
		            .Login(user.getLogin())
		            .MotPasse(user.getMotPasse())
		            .idDepartement(user.getIdDepartement())
		            .ToutDocument(user.getToutDocument())
		            .UpdatePassword(user.getUpdatePassword())
		            .build();*/
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
			UserDTO userDTO = modelMapper.map(user, UserDTO.class);
			return userDTO;
		}
	
	@Override
	public UserEntity convertDtoToEntity(UserDTO userDTO) {
		UserEntity user = new UserEntity();
		user = modelMapper.map(userDTO, UserEntity.class);
	    /*UserEntity userEntity = new UserEntity();
	    userEntity.setIdUser(userDTO.getIdUser());
	    userEntity.setCO_NO(userDTO.getCO_NO());
	    userEntity.setNom(userDTO.getNomUser());
	    userEntity.setPrenom(userDTO.getPrenomUser());
	    userEntity.setIdProfil(userDTO.getIdProfil());
	    userEntity.setActif(userDTO.getActif());
	    userEntity.setLogin(userDTO.getLogin());
	    userEntity.setMotPasse(userDTO.getMotPasse());
	    userEntity.setIdDepartement(userDTO.getIdDepartement());
	    userEntity.setToutDocument(userDTO.getToutDocument());
	    userEntity.setUpdatePassword(userDTO.getUpdatePassword());*/
	    return user;
	}



    
}
