package com.desafio5.donape.service.Impl;

import com.desafio5.donape.persistence.entities.Ubicacion;
import com.desafio5.donape.persistence.repository.UbicacionRepository;
import com.desafio5.donape.service.IUbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionServiceImpl implements IUbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    public List<Ubicacion> findAll(){
    return ubicacionRepository.findAll();
    }
}
