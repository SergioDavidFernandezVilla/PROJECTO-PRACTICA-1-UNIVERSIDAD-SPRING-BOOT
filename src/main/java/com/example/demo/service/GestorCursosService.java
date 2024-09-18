package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Alumno;
import com.example.demo.repositories.AlumnoRepository;
import com.example.demo.repositories.CursoRepository;

@Service
public class GestorCursosService {
    
    @Autowired
    AlumnoRepository alumnoRepository;

    @Autowired
    CursoRepository cursoRepository;

    public void CrearAlumno(Alumno alumno) {
        alumnoRepository.Crear(alumno);
    }

    public List<Alumno> BuscarTodosAlumnos() {
        return alumnoRepository.BuscarTodos();
    }

    public String BuscarTodosCursos() {
        return cursoRepository.BuscarTodos();
    }

}
