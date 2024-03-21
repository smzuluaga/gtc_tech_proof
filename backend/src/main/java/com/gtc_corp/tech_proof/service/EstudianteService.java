package com.gtc_corp.tech_proof.service;

import com.gtc_corp.tech_proof.entity.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> findAll();
    Estudiante findById(Integer id);
    Estudiante save(Estudiante estudiante);
    void deleteById(Integer id);
}
