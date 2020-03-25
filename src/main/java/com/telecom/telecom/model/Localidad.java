package com.telecom.telecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCALIDAD")
public class Localidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LOCALIDAD")
	private Long id;

	@Column(name = "NOMBRE_LOCALIDAD")
	private String nombreLocalidad;
}
