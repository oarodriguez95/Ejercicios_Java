package Logica;

public class ERepartidor extends Empleado {

    private static final int PLUS = 300;
    private String zona;

    public ERepartidor(String nombre, String apellido, int edad, double salario, String zona) {
        super(nombre, apellido, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean validarEdad() {
        return edad < 25;
    }

    public boolean validarZona() {
        return zona.equalsIgnoreCase("Zona 3");
    }

    public void Plus() {
        double salarioFinal = 0;
        if (validarEdad() && validarZona()) {
            salarioFinal = salario + ERepartidor.PLUS;
            System.out.println("El salario final es --> $" + salarioFinal);
        } else {
            System.out.println("No aplica para comision... Su salio es --> $" + salario);
        }
    }

    @Override
    public String toString() {
        return "Nombre completo: "+nombre+" "+apellido+", Edad: "+edad;
    }

}
