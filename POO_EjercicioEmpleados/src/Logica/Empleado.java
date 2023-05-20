package Logica;

public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    
    public abstract String toString();

    public abstract void Plus();
    
    public abstract boolean validarEdad();

}
