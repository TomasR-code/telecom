package com.telecom.telecom.controller;

import com.telecom.telecom.model.Domicilio;
import com.telecom.telecom.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomicilioControllerAlta {

    @Autowired
    DomicilioService domicilioService;

    @PostMapping("/crearDomicilio")
    public ResponseEntity<?> crearDomicilio(@RequestBody Domicilio ba) {
        if (ba != null) {
            ba = domicilioService.guardarDomicilio(ba);
            return new ResponseEntity<>(ba, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No se pudo guardar", HttpStatus.BAD_REQUEST);
        }
    }
}
