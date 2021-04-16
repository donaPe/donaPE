package com.desafio5.donape.controller;

import com.desafio5.donape.persistence.entities.Beneficios;
import com.desafio5.donape.service.IBeneficiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("donape")
public class BeneficiosController {
    @Autowired
    private IBeneficiosService beneficiosService;
    @GetMapping("/beneficios")
    public ResponseEntity<List<Beneficios>> findAll(){
        var answerClient = beneficiosService.findAll();
        return ResponseEntity.ok(answerClient);
    }
}
