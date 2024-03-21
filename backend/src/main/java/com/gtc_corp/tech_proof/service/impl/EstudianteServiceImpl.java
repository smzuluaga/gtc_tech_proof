package com.gtc_corp.tech_proof.service.impl;

import com.gtc_corp.tech_proof.entity.Estudiante;
import com.gtc_corp.tech_proof.repository.EstudianteRepository;
import com.gtc_corp.tech_proof.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Integer id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        return estudiante.get();
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteById(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
