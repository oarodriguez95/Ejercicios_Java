package logica;

public class Clase {

    private static int idClase = 0;
    private int numero;

    public Clase() {
        idClase++;
        this.numero = idClase; 
    }

    public void solicitudClase(Curso estudiantes, Aula salon, Profesor profesor) {
        System.out.println("--------------- Solicitud No -> " + numero+" --------------");
        System.out.println("Docente: " + profesor.getNombre());
        System.out.println("Aula Solicitada: " + salon.getIdAula());
        System.out.println("------------- Alumnos Registrados a la clase ---------------");
        estudiantes.listaAlumnos();
        System.out.println("------------------------------------------------------------");
        if (!cumpleTodo(estudiantes, salon, profesor)) {
            System.out.println("Solicitud RECHAZADA por las siguientes Razones");
            if (!validandoDisponibilidadProfesor(profesor)) {
                System.out.println(" - El profesor no está disponible...");
            }
            if (!validandoMateria(salon, profesor)) {
                System.out.println(" - La Asignatura del Aula no coincide con la Asignatura que imparte el docente " + profesor.getNombre());
            }
            if (!validandoCantAlumnos(estudiantes, salon)) {
                System.out.println(" - Cantidad de alumnos no permitida para dar la clase...");
            }
        } else {
            System.out.println("Solicitud ACEPTADA");
        }

    }

    private boolean validandoDisponibilidadProfesor(Profesor profesor) {
        return profesor.ValidandodisponibilidadPorNovillos() && profesor.profesorDisponible();
    }

    private boolean validandoMateria(Aula salon, Profesor profesor) {
        return salon.getMateriaAula() == profesor.getMateria();
    }

    private boolean validandoCantAlumnos(Curso estudiantes, Aula salon) {
        return ((estudiantes.cantAlumnosDisponibles() * 100) / salon.getCANT_MAX_ALUMNOS()) > 50 && estudiantes.contarAlumnos() <= salon.getCANT_MAX_ALUMNOS();
    }

    private boolean cumpleTodo(Curso estudiantes, Aula salon, Profesor profesor) {
        return validandoCantAlumnos(estudiantes, salon) && validandoDisponibilidadProfesor(profesor) && validandoMateria(salon, profesor);
    }
}
