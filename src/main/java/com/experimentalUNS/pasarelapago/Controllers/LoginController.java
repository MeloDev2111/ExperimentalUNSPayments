package com.experimentalUNS.pasarelapago.Controllers;

import com.experimentalUNS.pasarelapago.Models.Usuario;
import com.experimentalUNS.pasarelapago.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(path="login")
public class LoginController {
    @Autowired
    private UsuariosService usuariosService;

    @RequestMapping({"","/","/index"})
    public String index () {
        return "login";
    }

    @PostMapping("/validation")
    public String processForm(@RequestParam("email") String email,@RequestParam String password ) {
        Usuario usuario = usuariosService.getUsuario(email);

        if(usuario!=null){
            if(usuario.getPassword().equals(password)){
                System.out.println(usuario.toString());
                return "redirect:/perfil";
            }
        }

        return "redirect:/login";
    }

    @PostMapping("/logout")
    public String logout(){

        return "redirect:/login";
    }
}
