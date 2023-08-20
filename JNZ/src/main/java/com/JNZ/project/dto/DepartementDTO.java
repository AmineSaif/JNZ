package com.JNZ.project.dto;

import com.JNZ.project.entities.DepartementEntity;
import com.JNZ.project.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartementDTO {
        private long idDepartement;
        private String nomDepartement;
        private UserEntity responsableDepartement;
        private DepartementEntity departementParent;
}
