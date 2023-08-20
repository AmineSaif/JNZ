package com.JNZ.project.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;

@Entity
@Table(name = "Profile")
public class ProfileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	// Idprofil, iduser, Nomprofil, listofecrans

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "idUser")
	private UserEntity user;

	@Column(name = "NomProfile")
	private String Nom;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="listofecrans", referencedColumnName = "id")
	private EcranEntity list;
}
