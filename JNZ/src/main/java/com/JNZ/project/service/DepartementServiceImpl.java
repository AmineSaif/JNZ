package com.JNZ.project.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JNZ.project.dto.DepartementDTO;
import com.JNZ.project.entities.DepartementEntity;
import com.JNZ.project.repos.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {

    @Autowired
	ModelMapper modelMapper;

     @Autowired
    private DepartementRepository departementRepository;

    @Override
    public DepartementDTO createDepartement(DepartementDTO departement) {
        return convertEntityToDto(departementRepository.save(convertDtoToEntity(departement)));
    }

    @Override
    public DepartementDTO updateDepartement(DepartementDTO updateDepartement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDepartement'");
    }

    @Override
    public void deleteDepartement(Long idDepartement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDepartement'");
    }

    @Override
    public DepartementDTO getDepartementById(Long idDepartement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartementById'");
    }

    @Override
    public List<DepartementDTO> getAllDepartements() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDepartements'");
    }

    @Override
    public List<DepartementEntity> findByNomDepartement(String nomDepartement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomDepartement'");
    }

    @Override
    public List<DepartementEntity> findByNomDepartementContains(String nomDepartement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomDepartementContains'");
    }

    @Override
    public DepartementDTO convertEntityToDto(DepartementEntity departement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertEntityToDto'");
    }

    @Override
    public DepartementEntity convertDtoToEntity(DepartementDTO departementDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertDtoToEntity'");
    }
    
}
