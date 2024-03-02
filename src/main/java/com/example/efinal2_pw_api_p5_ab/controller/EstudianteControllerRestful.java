package com.example.efinal2_pw_api_p5_ab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.efinal2_pw_api_p5_ab.repository.model.Estudiante;
import com.example.efinal2_pw_api_p5_ab.service.IEstudianteService;
import com.example.efinal2_pw_api_p5_ab.service.to.EstudianteTo;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestful {


    @Autowired
    private IEstudianteService estudianteService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EstudianteTo>  listarTodos(){
        return  this.estudianteService.buscarTodos();
    }   

    @PostMapping()
    public void insertar(@RequestBody Estudiante e){
        this.estudianteService.insertar(e);

    }   

    
}
