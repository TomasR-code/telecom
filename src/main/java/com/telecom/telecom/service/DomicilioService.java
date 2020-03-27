package com.telecom.telecom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.telecom.model.Domicilio;
import com.telecom.telecom.repository.DomicilioRepository;

@Service
public class DomicilioService {

	@Autowired
	DomicilioRepository domicilioRepository;
	
	public Optional <Domicilio> buscarDomicilio(long id) {
		Optional<Domicilio> domicilio;
		domicilio = domicilioRepository.findById(id);
		return domicilio;
	}

	public Domicilio guardarDomicilio(Domicilio ba) {
		ba = domicilioRepository.save(ba);
		return ba;
	}
}
