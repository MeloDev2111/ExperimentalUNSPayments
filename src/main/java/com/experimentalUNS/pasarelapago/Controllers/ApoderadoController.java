package com.experimentalUNS.pasarelapago.Controllers;

import com.experimentalUNS.pasarelapago.Models.Apoderado;
import com.experimentalUNS.pasarelapago.Services.ApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/apoderados")
public class ApoderadoController {

    @Autowired
    ApoderadoService apoderadoService;

    @RequestMapping(path = "/poblar", method= RequestMethod.GET)
    public String poblarApoderados(){

        Apoderado apoderado1 = new Apoderado("12345678", "Melio",
                "Díaz", "Díaz", "hombre", "987654325", "El Carmen", "Tío");
        Apoderado apoderado2 = new Apoderado("98456381", "Harby",
                "Romero", "Loli", "so-so", "987654300", "La Capilla", "Tío");
        Apoderado apoderado3 = new Apoderado("12367453", "Alexis",
                "Gamboa", "Gonzales", "Hombre", "987341092", "Villa Don Victor", "Tío");
        Apoderado apoderado4 = new Apoderado("89345623", "Angel",
                "Cabana", "Herrera", "hombre", "987654115", "Casma", "sobrino");

        apoderadoService.agregar(apoderado1);
        apoderadoService.agregar(apoderado2);
        apoderadoService.agregar(apoderado3);
        apoderadoService.agregar(apoderado4);
        return "index";
    }
    @RequestMapping(path = {"/","/index",""}, method= RequestMethod.GET)
    public List<Apoderado> listarEstudiantes(){
        return  apoderadoService.listarTodos();
    }
}
