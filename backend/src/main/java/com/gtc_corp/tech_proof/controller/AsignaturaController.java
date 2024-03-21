package com.gtc_corp.tech_proof.controller;

import com.gtc_corp.tech_proof.entity.Asignatura;
import com.gtc_corp.tech_proof.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping
    public ResponseEntity<List<Asignatura>> findAll() {
        List<Asignatura> asignaturas = asignaturaService.findAll();
        return new ResponseEntity<>(asignaturas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asignatura> findById(@PathVariable("id") Integer id){
        Asignatura asignatura = asignaturaService.findById(id);
        return new ResponseEntity<>(asignatura, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Asignatura> save(@RequestBody Asignatura asignatura){
        Asignatura foundSubject = asignaturaService.save(asignatura);
        return  new ResponseEntity<>(foundSubject, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        asignaturaService.deleteById(id);
        return  new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
