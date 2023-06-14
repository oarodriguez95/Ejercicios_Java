package logica;

public class Principal {

    public static void main(String[] args) {
        Curso c = new Curso("E151");

        Aula salon = new Aula(59, Materia.MATEMATICAS);


        Profesor p = new Profesor("Piamonte", 50, Genero.M, Materia.FISICA);
        Profesor p1 = new Profesor("Vicente", 40, Genero.M, Materia.FILOSOFIA);
        Profesor p2 = new Profesor("Carime", 45, Genero.F, Materia.MATEMATICAS);

        c.agregarAlumno(new Estudiante("Oscar", 18, Genero.M, 4, 7.5));
        c.agregarAlumno(new Estudiante("Adriana", 15, Genero.F,91, 7));
        c.agregarAlumno(new Estudiante("Pedro", 14, Genero.M, 6, 4));
        c.agregarAlumno(new Estudiante("Nando", 16, Genero.M, 4, 7));
        c.agregarAlumno(new Estudiante("Martina", 18, Genero.M, 8, 9));
        c.agregarAlumno(new Estudiante("Adrian", 15, Genero.F, 1, 7));
        c.agregarAlumno(new Estudiante("Pedro", 14, Genero.M, 4, 4));
        c.agregarAlumno(new Estudiante("Nando", 16, Genero.M, 8, 7));
        c.agregarAlumno(new Estudiante("Adrian", 15, Genero.F, 7, 7));
        c.agregarAlumno(new Estudiante("Pedro", 14, Genero.M, 4, 4));

        Clase solicitud = new Clase();

        solicitud.solicitudClase(c, salon, p2);


    }

}
