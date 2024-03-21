package com.gtc_corp.tech_proof.service.impl;

import com.gtc_corp.tech_proof.entity.Docente;
import com.gtc_corp.tech_proof.repository.DocenteRepository;
import com.gtc_corp.tech_proof.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImpl implements DocenteService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente findById(Integer id) {
        Optional<Docente> docente = docenteRepository.findById(id);
        return docente.get();
    }

    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteById(Integer id) {
        docenteRepository.deleteById(id);
    }
}
