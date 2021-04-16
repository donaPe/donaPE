package com.desafio5.donape.service.Impl;

import com.desafio5.donape.persistence.entities.Beneficios;
import com.desafio5.donape.persistence.repository.BeneficiosRepository;
import com.desafio5.donape.service.IBeneficiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiosServiceImpl implements IBeneficiosService {
    @Autowired
    private BeneficiosRepository beneficiosRepository;

    @Override
    public List<Beneficios> findAll() {
        return beneficiosRepository.findAll();
    }
}
