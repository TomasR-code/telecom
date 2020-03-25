package com.telecom.telecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOMICILIO")
public class Domicilio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOMICILIO")
	private Long id;

	@Column(name = "CALLE")
	private String calle;
	
	@Column(name = "NUMERO")
	private Integer numero;
}
