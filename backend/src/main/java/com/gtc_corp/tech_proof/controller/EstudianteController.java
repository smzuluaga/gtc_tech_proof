package com.gtc_corp.tech_proof.controller;

import com.gtc_corp.tech_proof.entity.Estudiante;
import com.gtc_corp.tech_proof.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<Estudiante>> findAll() {
        List<Estudiante> estudiantes = estudianteService.findAll();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findById(@PathVariable("id") Integer id){
        Estudiante estudiante = estudianteService.findById(id);
        return new ResponseEntity<>(estudiante, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){
        Estudiante foundStudent = estudianteService.save(estudiante);
        return  new ResponseEntity<>(foundStudent, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
            estudianteService.deleteById(id);
        return  new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
