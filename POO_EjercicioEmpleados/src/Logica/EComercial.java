/*• En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicara el plus.*/
package Logica;

public class EComercial extends Empleado {

    private static final int PLUS = 300;
    private static final double comisionMinima = 200;
    private double comision;

    public EComercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision = comision;
    }

    @Override
    public boolean validarEdad() {
        return edad > 30;
    }

    public boolean validarComision() {
        return comision > EComercial.comisionMinima;
    }

    

    @Override
    public void Plus() {
        double salarioFinal = 0;
        if (validarEdad() && validarComision()) {
            salarioFinal = salario + EComercial.PLUS;
            System.out.println("El salario final es --> $" + salarioFinal);
        } else {
            System.out.println("No aplica para comision... Su salario es --> $" + salario);
        }
    }

    @Override
    public String toString() {
        return "Nombre completo: "+nombre+" "+apellido+", Edad: "+edad;
    }

}
