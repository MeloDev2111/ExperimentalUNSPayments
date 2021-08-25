package com.experimentalUNS.pasarelapago.Services;

import com.experimentalUNS.pasarelapago.Models.Usuario;
import com.experimentalUNS.pasarelapago.Repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    private UsuarioRepository usuariosRepository;
    @Autowired
    public UsuariosServiceImpl(UsuarioRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }


    @Override
    public Usuario agregar(Usuario usuario) {
        Usuario agregado;
        agregado = usuariosRepository.saveAndFlush(usuario);
        return agregado;
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuario buscar(Long id) {
        Usuario result = null;
        Optional<Usuario> buscado = usuariosRepository.findById(id);
        if (buscado.isPresent()) {
            result = buscado.get();
        }
        return result;
    }

    public String getSalute(){
        return "Hello";
    }

    @Override
    public Usuario getUsuario(String email) {
        Optional<Usuario> user = usuariosRepository.findUserByEmail(email);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

    @Override
    public Usuario getUltimoUsuario() {
        return usuariosRepository.findLastUser().get();
    }
}
