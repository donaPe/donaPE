package com.desafio5.donape.service;

import com.desafio5.donape.persistence.entities.Beneficios;
import java.util.List;

public interface IBeneficiosService {
    public List<Beneficios> findAll();
}
