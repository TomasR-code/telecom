package com.telecom.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telecom.telecom.repository.BarrioRepository;

@Service
public class BarrioService {

	@Autowired
	BarrioRepository barropRepository;
}
