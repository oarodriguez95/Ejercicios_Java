package logica;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void retirarDinero(double dinero) {
        if (validarNumeros(dinero)) {
            if (saldoDisponible(dinero)) {
                this.cantidad = this.cantidad - dinero;
                System.out.println("Retiro Exitoso");
            }{
            System.out.println("Fondos insuficientes");
        }
        }else{
            System.out.println("Cantidad no permitida");
        }
    }

    public void ingresarDinero(double dinero) {
        if (validarNumeros(dinero)) {
            this.cantidad = this.cantidad + dinero;
            System.out.println("Cuenta cargada correctamente.");
        } else {
            System.out.println("Cantidad no permitida");
        }
    }

    private boolean validarNumeros(double dinero) {
        return dinero > 0;
    }

    private boolean saldoDisponible(double dinero) {
        return this.cantidad >= dinero;
    }

    @Override
    public String toString() {
        return "Cuenta {" + "Titular =" + titular + ", Cantidad = $" + cantidad + '}';
    }

}
