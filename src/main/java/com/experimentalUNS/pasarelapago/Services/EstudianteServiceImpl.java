package com.experimentalUNS.pasarelapago.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.experimentalUNS.pasarelapago.Models.Estudiante;
import com.experimentalUNS.pasarelapago.Repositorios.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepo;


    @Override
    public Estudiante agregar(Estudiante estudiante) {
        Estudiante estudianteEntity = estudianteRepo.save(estudiante);
        return estudianteEntity;
    }

    @Override
    public List<Estudiante> listarTodos() {
        List<Estudiante> listEstudianteEntity = estudianteRepo.findAll();
        return listEstudianteEntity;
    }

    @Override
    public Estudiante buscar(Long aLong) {
        return null;
    }
}
