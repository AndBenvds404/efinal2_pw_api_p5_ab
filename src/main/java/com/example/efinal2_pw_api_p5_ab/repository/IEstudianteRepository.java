package com.example.efinal2_pw_api_p5_ab.repository;

import java.util.List;

import com.example.efinal2_pw_api_p5_ab.repository.model.Estudiante;

public interface IEstudianteRepository {
     
    public List<Estudiante> buscarTodos();

    public void insertar(Estudiante estudiante );

    
}
