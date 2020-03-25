package com.telecom.telecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BARRIO")
public class Barrio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BARRIO")
	private Long id;

	@Column(name = "NOMBRE_CUENTA")
	private String nombreCuenta;
}
