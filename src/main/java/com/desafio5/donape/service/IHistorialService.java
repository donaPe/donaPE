package com.desafio5.donape.service;

import com.desafio5.donape.persistence.entities.Historial;

import java.util.List;

public interface IHistorialService {
    public List<Historial> findAllDni(String dni);
}
