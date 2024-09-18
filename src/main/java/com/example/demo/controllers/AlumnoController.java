package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.GestorCursosService;
import org.springframework.ui.Model;

@Controller
public class AlumnoController {
    @Autowired
    GestorCursosService servicio;

    @RequestMapping("/list-alumnos")
    public String ListaAlumnos(Model modelo) {
        modelo.addAttribute("listaAlumnos", servicio.BuscarTodosAlumnos());
        return "listaAlumnos";
    }
}
