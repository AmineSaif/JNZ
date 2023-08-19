package com.JNZ.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String CO_NO;
    private String nomUser;
    private String prenomUser;
    private Long idProfil;
    private Boolean Actif;
    private String Login;
    private String MotPasse;
    private Long idDepartement;
    private Boolean ToutDocument;
    private Boolean UpdatePassword;
    
    

    public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(String cO_NO, String nom, String prenom, Long idProfil, Boolean actif, String login,
			String motPasse, Long idDepartement, Boolean toutDocument, Boolean updatePassword) {
		super();
		CO_NO = cO_NO;
		nomUser = nom;
		prenomUser = prenom;
		this.idProfil = idProfil;
		Actif = actif;
		Login = login;
		MotPasse = motPasse;
		this.idDepartement = idDepartement;
		ToutDocument = toutDocument;
		UpdatePassword = updatePassword;
	}
    // Getters and setters

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getCO_NO() {
        return CO_NO;
    }

    public void setCO_NO(String CO_NO) {
        this.CO_NO = CO_NO;
    }

    public String getNom() {
        return nomUser;
    }

    public void setNom(String nom) {
        nomUser = nom;
    }

    public String getPrenom() {
        return prenomUser;
    }

    public void setPrenom(String prenom) {
        prenomUser = prenom;
    }

    public Long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(Long idProfil) {
        this.idProfil = idProfil;
    }

    public Boolean getActif() {
        return Actif;
    }

    public void setActif(Boolean actif) {
        Actif = actif;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getMotPasse() {
        return MotPasse;
    }

    public void setMotPasse(String motPasse) {
        MotPasse = motPasse;
    }

    public Long getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public Boolean getToutDocument() {
        return ToutDocument;
    }

    public void setToutDocument(Boolean toutDocument) {
        ToutDocument = toutDocument;
    }




	public Boolean getUpdatePassword() {
        return UpdatePassword;
    }

    public void setUpdatePassword(Boolean updatePassword) {
        UpdatePassword = updatePassword;
    }

	@Override
	public String toString() {
		return "UserEntity [idUser=" + idUser + ", CO_NO=" + CO_NO + ", Nom=" + nomUser + ", Prenom=" + prenomUser
				+ ", idProfil=" + idProfil + ", Actif=" + Actif + ", Login=" + Login + ", MotPasse=" + MotPasse
				+ ", idDepartement=" + idDepartement + ", ToutDocument=" + ToutDocument + ", UpdatePassword="
				+ UpdatePassword + "]";
	}

	
    
    
}
