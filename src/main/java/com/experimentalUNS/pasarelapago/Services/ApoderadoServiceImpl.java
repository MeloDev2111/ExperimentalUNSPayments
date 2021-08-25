package com.experimentalUNS.pasarelapago.Services;

import com.experimentalUNS.pasarelapago.Models.Apoderado;
import com.experimentalUNS.pasarelapago.Models.Estudiante;
import com.experimentalUNS.pasarelapago.Repositorios.ApoderadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApoderadoServiceImpl implements ApoderadoService{
    @Autowired
    private ApoderadoRepository apoderadoRepository;

    @Override
    public Apoderado agregar(Apoderado apoderado) {
        Apoderado apoderadoEntity = apoderadoRepository.save(apoderado);
        return apoderadoEntity;
    }

    @Override
    public List<Apoderado> listarTodos() {
        List<Apoderado> listApoderadoEntity = apoderadoRepository.findAll();
        return listApoderadoEntity;
    }

    @Override
    public Apoderado buscar(Long aLong) {
        return null;
    }
}
