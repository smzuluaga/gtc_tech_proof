package com.gtc_corp.tech_proof.service.impl;

import com.gtc_corp.tech_proof.entity.Asignatura;
import com.gtc_corp.tech_proof.repository.AsignaturaRepository;
import com.gtc_corp.tech_proof.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    @Autowired
    AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> findAll() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura findById(Integer id) {
        Optional<Asignatura> asignatura = asignaturaRepository.findById(id);
        return asignatura.get();
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void deleteById(Integer id) {
        asignaturaRepository.deleteById(id);
    }
}
