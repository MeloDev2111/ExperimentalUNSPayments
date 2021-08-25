package com.experimentalUNS.pasarelapago.Repositorios;


import com.experimentalUNS.pasarelapago.Models.Apoderado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApoderadoRepository extends JpaRepository<Apoderado, Long>{
    //Apoderado findByIdApoderado(String idApoderado);
}
