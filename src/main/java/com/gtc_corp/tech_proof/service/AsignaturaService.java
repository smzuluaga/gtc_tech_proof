package com.gtc_corp.tech_proof.service;

import com.gtc_corp.tech_proof.entity.Asignatura;

import java.util.List;

public interface AsignaturaService {
    List<Asignatura> findAll();
    Asignatura findById(Integer id);
    Asignatura save(Asignatura asignatura);
    void deleteById(Integer id);
}
