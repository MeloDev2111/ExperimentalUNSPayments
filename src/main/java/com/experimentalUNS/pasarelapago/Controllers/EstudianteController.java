package com.experimentalUNS.pasarelapago.Controllers;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import com.experimentalUNS.pasarelapago.Models.Estudiante;
import com.experimentalUNS.pasarelapago.Models.Usuario;
import com.experimentalUNS.pasarelapago.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "api/estudiantes")
public class EstudianteController {
    
    @Autowired
    EstudianteService estService;

    @RequestMapping(path = "/poblar", method= RequestMethod.GET)
    public String poblarEstudiantes(){
        Estudiante est1 = new Estudiante("77340061", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814019");
        Estudiante est2 = new Estudiante("77340062", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814021");
        Estudiante est3 = new Estudiante("77340063", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814020");
        estService.agregar(est1);
        estService.agregar(est2);
        estService.agregar(est3);
        return "index";
    }
    @RequestMapping(path = {"/","/index",""}, method= RequestMethod.GET)
    public List<Estudiante> listarEstudiantes(){
        return  estService.listarTodos();
    }
}
