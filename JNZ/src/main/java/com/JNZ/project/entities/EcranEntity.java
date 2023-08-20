package com.JNZ.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ecran")
public class EcranEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long Id;

	@Column(name = "nom")
	private String nom;

	@OneToOne(mappedBy = "list")
	private ProfileEntity profile;
}
