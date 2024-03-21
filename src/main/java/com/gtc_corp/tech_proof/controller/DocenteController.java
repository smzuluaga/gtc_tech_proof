package com.gtc_corp.tech_proof.controller;

import com.gtc_corp.tech_proof.entity.Docente;
import com.gtc_corp.tech_proof.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class DocenteController {

    @Autowired
    DocenteService docenteService;

    @GetMapping
    public ResponseEntity<List<Docente>> findAll() {
        List<Docente> docentes = docenteService.findAll();
        return new ResponseEntity<>(docentes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> findById(@PathVariable("id") Integer id){
        Docente docente = docenteService.findById(id);
        return new ResponseEntity<>(docente, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Docente> save(@RequestBody Docente docente){
        Docente foundTeacher = docenteService.save(docente);
        return  new ResponseEntity<>(foundTeacher, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        docenteService.deleteById(id);
        return  new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
