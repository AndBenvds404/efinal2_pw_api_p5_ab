package com.example.efinal2_pw_api_p5_ab.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    
    @Id
    @Column(name = "estu_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq_id")
	@SequenceGenerator(name = "estu_seq_id", sequenceName = "estu_seq_id", allocationSize = 1)
    private Integer id;
    @Column(name = "estu_nombre")
    private String nombre;
    
    @Column(name = "estu_apellido")
    private String apellido;
    
    @Column(name = "estu_cedula")
    private String cedula;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    




}
