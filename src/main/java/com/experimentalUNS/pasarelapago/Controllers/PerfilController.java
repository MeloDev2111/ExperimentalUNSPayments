package com.experimentalUNS.pasarelapago.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(path = "perfil")
public class PerfilController {

    @RequestMapping(path = {"","/"})
    public String index(){
        return "perfil";
    }
}
