package com.JNZ.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DepartementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartement;
    private String nomDepartement;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private UserEntity responsableDepartement;

    @ManyToOne
    @JoinColumn(name = "department_parent_id")
    private DepartementEntity departementParent;


    public DepartementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

    public DepartementEntity(long idDepartement, String nomDepartement) {
        this.idDepartement = idDepartement;
        this.nomDepartement = nomDepartement;
    }
    // Getters and setters

    public long getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    } 

    public UserEntity getResponsableDepartement() {
        return responsableDepartement;
    }

    public void setResponsableDepartement(UserEntity responsableDepartement) {
        this.responsableDepartement = responsableDepartement;
    }  

    public DepartementEntity getDepartmentParent() {
        return departementParent;
    }

    public void setDepartmentParent(DepartementEntity departmentParent) {
        this.departementParent = departmentParent;
    }
}
