package com.gtc_corp.tech_proof.service;

import com.gtc_corp.tech_proof.entity.Docente;

import java.util.List;

public interface DocenteService {
    List<Docente> findAll();
    Docente findById(Integer id);
    Docente save(Docente docente);
    void deleteById(Integer id);
}
