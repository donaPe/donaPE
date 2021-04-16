package com.desafio5.donape.persistence.repository;

import com.desafio5.donape.persistence.entities.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion,Integer> {
}
