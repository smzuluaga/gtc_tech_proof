package com.gtc_corp.tech_proof.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="tipo_documento_identidad")
    private String tipoDocumentoIdentidad;
    @Column(name="documento_identidad")
    private String documentoIdentidad;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name="grado_matriculado")
    private String gradoMatriculado;
    @Column(name="ciudad_residencia")
    private String ciudadResidencia;
    @Column(name="direccion")
    private String direccion;
    @Column(name="email")
    private String email;
    @Column(name="telefono_fijo")
    private String telefonoFijo;
    @Column(name="celular")
    private String celular;
    @Column(name="nombre_completo_acudiente")
    private String nombreCompletoAcudiente;

}
