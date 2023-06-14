package logica;

public class Persona {

    private static final int PESO_BAJITO = -1;
    private static final String GENERO = "Genero Indefinido";
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;
    private String nombre;
    private int edad;
    private String numDoc;
    private String sexo;
    private int peso;
    private double altura;

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarNumDoc();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = 0;
        imc = this.peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return PESO_BAJITO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public void comprobarSexo() {
        if (!this.sexo.equalsIgnoreCase("H") && !this.sexo.equalsIgnoreCase("M")) {
            this.sexo = GENERO;
        }
    }

    public void generarNumDoc() {
        double name =  ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000)); 
        this.numDoc= String.valueOf(name);
    }
    
    public boolean esMayordeEdad(){
        return this.edad >= 18;
    }

    @Override
    public String toString() {

        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + numDoc + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
