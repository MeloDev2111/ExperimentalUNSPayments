package com.experimentalUNS.pasarelapago.Repositorios;

import com.experimentalUNS.pasarelapago.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    @Query(nativeQuery = true,
            value ="SELECT * FROM Usuario u ORDER BY Id DESC Limit 1")
    Optional<Usuario> findLastUser();

    @Query("SELECT u FROM Usuario u WHERE u.email=?1")
    Optional<Usuario> findUserByEmail(String email);
}
