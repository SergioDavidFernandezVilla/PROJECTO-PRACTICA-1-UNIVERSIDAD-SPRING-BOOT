package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Curso;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository {
    private static List<Curso> cursos = new ArrayList<Curso>();

    static {
        cursos.add(new Curso("java", 20));
        cursos.add(new Curso("php", 30));
        cursos.add(new Curso("python", 50));
    }

    public String BuscarTodos() {
        return "cursos";
    }
}
