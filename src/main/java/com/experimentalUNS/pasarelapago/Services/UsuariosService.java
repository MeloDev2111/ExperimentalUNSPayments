package com.experimentalUNS.pasarelapago.Services;

import com.experimentalUNS.pasarelapago.Models.Usuario;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsuariosService extends iGenericoService<Usuario, Long>{
    public Usuario getUsuario(String email);
    public Usuario getUltimoUsuario();
}
