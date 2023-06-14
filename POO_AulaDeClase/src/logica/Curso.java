package logica;

import java.util.ArrayList;

public class Curso {

    private String nombreCurso;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarAlumno(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public int cantAlumnosDisponibles() {
        int cantAlumnosDisponibles = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).ValidandodisponibilidadPorNovillos()) {
                cantAlumnosDisponibles++;
            }
        }
        return cantAlumnosDisponibles;
    }

    public int contarAlumnos() {
        int cont = 0;
        for (Estudiante estudiante : estudiantes) {
            cont++;
        }
        return cont;
    }

    public void listaAlumnos() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
