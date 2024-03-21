package com.gtc_corp.tech_proof.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "school_years")
public class SchoolYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="school_year")
    private String schoolYear;
    @Column(name="director")
    private String director;
    @Column(name="asignaturas")
    private String asignaturas;
}
