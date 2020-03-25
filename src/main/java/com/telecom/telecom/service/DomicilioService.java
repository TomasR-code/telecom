package com.telecom.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telecom.telecom.repository.DomicilioRepository;

@Service
public class DomicilioService {

	@Autowired
	DomicilioRepository domicilioRepository;
}
