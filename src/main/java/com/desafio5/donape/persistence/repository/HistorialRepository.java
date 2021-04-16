package com.desafio5.donape.persistence.repository;

import com.desafio5.donape.persistence.entities.Historial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistorialRepository extends JpaRepository<Historial, Integer> {
    List<Historial> findByDni(String dni);
}
