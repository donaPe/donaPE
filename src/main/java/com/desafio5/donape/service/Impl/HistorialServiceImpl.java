package com.desafio5.donape.service.Impl;

import com.desafio5.donape.persistence.entities.Historial;
import com.desafio5.donape.persistence.repository.HistorialRepository;
import com.desafio5.donape.service.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialServiceImpl implements IHistorialService {
    @Autowired
    private HistorialRepository historialRepository;

    public List<Historial> findAllDni(String dni)
    {
        return historialRepository.findByDni(dni);
    }
}
