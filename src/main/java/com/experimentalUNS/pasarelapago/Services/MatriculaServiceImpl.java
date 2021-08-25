package com.experimentalUNS.pasarelapago.Services;

import com.experimentalUNS.pasarelapago.Models.Apoderado;
import com.experimentalUNS.pasarelapago.Models.Matricula;
import com.experimentalUNS.pasarelapago.Repositorios.ApoderadoRepository;
import com.experimentalUNS.pasarelapago.Repositorios.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements MatriculaService{
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public Matricula agregar(Matricula matricula) {
        Matricula matriculaEntity = matriculaRepository.save(matricula);
        return matriculaEntity;
    }

    @Override
    public List<Matricula> listarTodos() {
        List<Matricula> listMatriculaEntity = matriculaRepository.findAll();
        return listMatriculaEntity;
    }

    @Override
    public Matricula buscar(Long aLong) {
        return null;
    }

}
