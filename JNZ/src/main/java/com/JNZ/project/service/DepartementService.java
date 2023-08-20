package com.JNZ.project.service;

import java.util.List;

import com.JNZ.project.dto.DepartementDTO;
import com.JNZ.project.dto.UserDTO;
import com.JNZ.project.entities.DepartementEntity;

public interface DepartementService {

    DepartementDTO createDepartement(DepartementDTO departement);

    DepartementDTO updateDepartement(DepartementDTO updateDepartement);

    void deleteDepartement(Long idDepartement);

    DepartementDTO getDepartementById(Long idDepartement);

    List<DepartementDTO> getAllDepartements();

    List<DepartementEntity> findByNomDepartement(String nomDepartement);

	List<DepartementEntity> findByNomDepartementContains(String nomDepartement);

    DepartementDTO convertEntityToDto(DepartementEntity departement);

	DepartementEntity convertDtoToEntity(DepartementDTO departementDTO);

}
