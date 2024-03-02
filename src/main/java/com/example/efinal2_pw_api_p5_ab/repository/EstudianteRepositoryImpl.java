package com.example.efinal2_pw_api_p5_ab.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.efinal2_pw_api_p5_ab.repository.model.Estudiante;






@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {


    @PersistenceContext
    private EntityManager entityManager ;

    @Override
    public List<Estudiante> buscarTodos() {
        // TODO Auto-generated method stub
        var query = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
        return query.getResultList();
    }


    @Override
    public void insertar(Estudiante estudiante) {
        // TODO Auto-generated method stub
        this.entityManager.persist(estudiante);
        
    }
    
}
