package com.JNZ.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Ecran")
@Getter
@Setter
@AllArgsConstructor
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
