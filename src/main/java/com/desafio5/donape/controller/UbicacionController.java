package com.desafio5.donape.controller;

import com.desafio5.donape.persistence.entities.Ubicacion;
import com.desafio5.donape.service.IUbicacionService;
import com.desafio5.donape.service.Impl.UbicacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UbicacionController {
    @Autowired
    private IUbicacionService ubicacionService;

    @GetMapping("/donape/ubicacion")
    public ResponseEntity<List<Ubicacion>> findAll(){
        var answerClient = ubicacionService.findAll();
        return ResponseEntity.ok(answerClient);
    }

}
