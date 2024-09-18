package com.example.demo.repositories;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.models.Alumno;

@Repository
public class AlumnoRepository {
    private static List<Alumno> alumnos = new ArrayList<>();

    static {
        alumnos.add(new Alumno ("pedro", 20));
        alumnos.add(new Alumno ("angel", 30));
        alumnos.add(new Alumno ("ana", 50));
    }

    public List<Alumno> BuscarTodos() {
        return alumnos;
    }

    public void Crear(Alumno alumno) {
        alumnos.add(alumno);
    }
}
