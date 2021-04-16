package com.desafio5.donape.persistence.repository;

import com.desafio5.donape.persistence.entities.Beneficios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiosRepository extends JpaRepository <Beneficios, Integer> {
}
