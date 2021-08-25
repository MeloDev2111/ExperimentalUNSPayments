package com.experimentalUNS.pasarelapago.Repositorios;

import com.experimentalUNS.pasarelapago.Models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    Estudiante findByCodEstudiante(String codEstudiante);
}