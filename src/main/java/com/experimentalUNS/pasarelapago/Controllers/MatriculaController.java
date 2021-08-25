package com.experimentalUNS.pasarelapago.Controllers;

import com.experimentalUNS.pasarelapago.Models.Apoderado;
import com.experimentalUNS.pasarelapago.Models.Estudiante;
import com.experimentalUNS.pasarelapago.Models.Matricula;
import com.experimentalUNS.pasarelapago.Services.ApoderadoService;
import com.experimentalUNS.pasarelapago.Services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(path = "api/matriculas")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;

    @RequestMapping(path = "/poblar", method= RequestMethod.GET)
    public String poblarMatriculas(){

        Apoderado apoderado1 = new Apoderado("12345678", "Melio",
                "Díaz", "Díaz", "hombre", "987654325", "El Carmen", "Tío");
        Apoderado apoderado2 = new Apoderado("98456381", "Harby",
                "Romero", "Loli", "so-so", "987654300", "La Capilla", "Tío");
        Apoderado apoderado3 = new Apoderado("12367453", "Alexis",
                "Gamboa", "Gonzales", "Hombre", "987341092", "Villa Don Victor", "Tío");

        Estudiante estudiante1 = new Estudiante("77340061", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814019");
        Estudiante estudiante2 = new Estudiante("77340062", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814021");
        Estudiante estudiante3 = new Estudiante("77340063", "Alexis", "Gamboa", "Gonzales", "Hombre",
                Calendar.getInstance(), "0201814020");

        Matricula matricula1 = new Matricula(estudiante1, apoderado1, Calendar.getInstance(), "123456789123");
        Matricula matricula2 = new Matricula(estudiante2, apoderado2, Calendar.getInstance(), "123456789124");
        Matricula matricula3 = new Matricula(estudiante3, apoderado3, Calendar.getInstance(), "123456789125");

        matriculaService.agregar(matricula1);
        matriculaService.agregar(matricula2);
        matriculaService.agregar(matricula3);
        return "index";
    }
    @RequestMapping(path = {"/","/index",""}, method= RequestMethod.GET)
    public List<Matricula> listarEstudiantes(){
        return matriculaService.listarTodos();
    }
}
