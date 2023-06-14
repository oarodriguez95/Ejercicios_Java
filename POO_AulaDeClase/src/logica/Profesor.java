package logica;

public class Profesor extends Persona {

    private static int TOTAL_CLASES = 10;
    private int ausenciaProfesor = 1;
    private Materia materia;

    public Profesor(String nombre, int edad, Genero genero, Materia materia) {
        super(nombre, edad, genero);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean ValidandodisponibilidadPorNovillos() {
        int porcFaltas = 0;
        porcFaltas = (ausenciaProfesor * 100) / TOTAL_CLASES;
        return porcFaltas < 20;
    }

    public boolean profesorDisponible() {
        return true;
    }
}
