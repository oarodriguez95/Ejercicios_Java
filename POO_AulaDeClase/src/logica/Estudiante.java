package logica;

public class Estudiante extends Persona {

    private static int TOTAL_CLASES = 10;
    private int ausenciaAlumno;
    private double notaDefinitiva;

    public Estudiante(String nombre, int edad, Genero genero,int ausenciaAlumno, double notaDefinitiva) {
        super(nombre, edad, genero);
        this.ausenciaAlumno = ausenciaAlumno;
        this.notaDefinitiva = notaDefinitiva;
    }

    @Override
    public boolean ValidandodisponibilidadPorNovillos() { //Ejemplo asuenciaAlumno = 4
        return (this.ausenciaAlumno * 100) / TOTAL_CLASES < 50; // 4 * 100 = 400 / 10 = 40 || 40<50 = true
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Genero: " + genero + ", Nota: " + notaDefinitiva + ", Estado: " + ValidandodisponibilidadPorNovillos();
    }
}
