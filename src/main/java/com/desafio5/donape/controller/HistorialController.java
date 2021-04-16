package com.desafio5.donape.controller;

import com.desafio5.donape.persistence.entities.Historial;
import com.desafio5.donape.service.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("donape")
public class HistorialController {
    @Autowired
    private IHistorialService historialService;

    @GetMapping("/historial/{dni}")
    public ResponseEntity<List<Historial>> findById(@PathVariable("dni") String dni){
        var answerClient = this.historialService.findAllDni(dni);
        return ResponseEntity.ok(answerClient);
    }
}
