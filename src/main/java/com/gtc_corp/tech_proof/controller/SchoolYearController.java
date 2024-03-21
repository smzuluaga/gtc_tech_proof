package com.gtc_corp.tech_proof.controller;

import com.gtc_corp.tech_proof.entity.SchoolYear;
import com.gtc_corp.tech_proof.service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schoolyears")
public class SchoolYearController {

    @Autowired
    SchoolYearService schoolYearService;

    @GetMapping
    public ResponseEntity<List<SchoolYear>> findAll() {
        List<SchoolYear> schoolYears = schoolYearService.findAll();
        return new ResponseEntity<>(schoolYears, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchoolYear> findById(@PathVariable("id") Integer id){
        SchoolYear schoolYear = schoolYearService.findById(id);
        return new ResponseEntity<>(schoolYear, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SchoolYear> save(@RequestBody SchoolYear asignatura){
        SchoolYear foundSchoolYear = schoolYearService.save(asignatura);
        return  new ResponseEntity<>(foundSchoolYear, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        schoolYearService.deleteById(id);
        return  new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
