package com.example.efinal2_pw_api_p5_ab.service.to;

import java.io.Serializable;

import javax.persistence.Column;

import org.springframework.hateoas.RepresentationModel;



public class EstudianteTo extends RepresentationModel <EstudianteTo> implements Serializable{

    private final static long serializableIU = 1L;
    
    @Column(name = "estu_id")
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
