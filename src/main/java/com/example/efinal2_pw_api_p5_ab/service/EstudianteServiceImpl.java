package com.example.efinal2_pw_api_p5_ab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal2_pw_api_p5_ab.repository.IEstudianteRepository;
import com.example.efinal2_pw_api_p5_ab.repository.model.Estudiante;
import com.example.efinal2_pw_api_p5_ab.service.to.EstudianteTo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRepository iEstudianteRepository;


    @Override
    public List<EstudianteTo> buscarTodos() {
        // TODO Auto-generated method stub
        List<Estudiante> listaEstu = this.iEstudianteRepository.buscarTodos();

        List<EstudianteTo> listaEstuTo = new ArrayList<>();

        for (Estudiante estudiante : listaEstu) {
            listaEstuTo.add(convertir(estudiante));
             
        }
        return listaEstuTo;
    }


    @Override
    public void insertar(Estudiante estudiante) {
        // TODO Auto-generated method stub
         this.iEstudianteRepository.insertar(estudiante);
    }



    public EstudianteTo convertir(Estudiante e){
        EstudianteTo estuTo = new EstudianteTo();

        estuTo.setCedula(e.getCedula());
        estuTo.setNombre(e.getNombre());
        estuTo.setApellido(e.getApellido());
        estuTo.setId(e.getId());

        return estuTo;
    }

    
}
