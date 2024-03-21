package com.gtc_corp.tech_proof.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="docente")
    private String docente;
    @Column(name="id_estudiante")
    private String id_estudiante;
    @Column(name="asignaturas")
    private String asignaturas;
    @Column(name="school_year")
    private String schoolYear;
}
