package com.experimentalUNS.pasarelapago.Controllers;

import com.experimentalUNS.pasarelapago.Models.Usuario;
import com.experimentalUNS.pasarelapago.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/usuarios")
public class UsuarioController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuarioController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

    /*@GetMapping
    public List<Usuario> hello(){
        return usuariosService.listarTodos();
    }
     */

    @RequestMapping(path = "/poblar", method= RequestMethod.GET)
    public String poblarUsuarios(){
        Usuario u1 = new Usuario((long) 1, "Pedro","PicaPiedra","PPP@gmail.com","Picapiedra2111");
        Usuario u2 = new Usuario((long) 2, "Pedrito","Alimaña","PAlimaña@gmail.com","ConMuchaMaña");
        Usuario u3 = new Usuario((long) 3, "Pepito","Serapio","PSerapio@gmail.com","Serapio2111");
        Usuario u4 = new Usuario((long) 4, "Banana","Valvoa","BananaCDP@gmail.com","CDP2111");

        usuariosService.agregar(u1);
        usuariosService.agregar(u2);
        usuariosService.agregar(u3);
        usuariosService.agregar(u4);
        return "index";
    }

    @RequestMapping(path = {"/","/index",""}, method= RequestMethod.GET)
    public List<Usuario> listarUsuarios(){
        return usuariosService.listarTodos();
    }

    @RequestMapping(path = "/mostrar", method=RequestMethod.GET)
    public String getUsuarios(){
        for (Usuario u: usuariosService.listarTodos() ) {
            System.out.println(u.toString());
        }

        return "index";
    }

    @RequestMapping(path = "/last", method=RequestMethod.GET)
    public List<Usuario> getUltimo(){
        return List.of(usuariosService.getUltimoUsuario());
    }

    @RequestMapping(path = "/email/{email}", method=RequestMethod.GET)
    public List<Usuario> getUsuarioByEmail(@PathVariable String email){
        return List.of(usuariosService.getUsuario(email));
    }

}
