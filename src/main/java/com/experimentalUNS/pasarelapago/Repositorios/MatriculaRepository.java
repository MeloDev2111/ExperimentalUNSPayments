package com.experimentalUNS.pasarelapago.Repositorios;

import com.experimentalUNS.pasarelapago.Models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    //Matricula findByCodMatricula(String codMatricula);
}
