package logica;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected Genero genero;

    public Persona(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public abstract boolean ValidandodisponibilidadPorNovillos();
    
    
}
