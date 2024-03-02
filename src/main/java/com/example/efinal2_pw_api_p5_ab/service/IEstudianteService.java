package com.example.efinal2_pw_api_p5_ab.service;

import java.util.List;

import com.example.efinal2_pw_api_p5_ab.repository.model.Estudiante;
import com.example.efinal2_pw_api_p5_ab.service.to.EstudianteTo;

public interface IEstudianteService {
    
      
    public List<EstudianteTo> buscarTodos();

    public void insertar(Estudiante estudiante );
}
