package com.JNZ.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
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
}
