package logica;

public class Televisor extends Electrodomestico {

    private static final int DEFAULT_PULGADAS = 20;
    private static final boolean DEFAULT_TDT = false;
    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor(int pulgadas, boolean sintonizadorTDT, double precioBase, String color, double consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
        this(DEFAULT_PULGADAS, DEFAULT_TDT, DEFAULT_PRECIO_BASE, DEFAULT_COLOR, DEFAULT_CONSUMO_ENERGETICO, DEFAULT_PESO);
    }

    public Televisor(double precioBase, double peso) {
        this(DEFAULT_PULGADAS, DEFAULT_TDT, precioBase, DEFAULT_COLOR, DEFAULT_CONSUMO_ENERGETICO, peso);

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double comprobarPulgadas() {
        double costoPorPulgada = 0;
        if (this.pulgadas > 40) {
            costoPorPulgada = precioBase + (precioBase * 0.30);
        } else {
            costoPorPulgada = 0;
        }
        return costoPorPulgada;
    }

    public double comprobarTDT() {
        double costoPorTDT;
        if (isSintonizadorTDT()) {
            costoPorTDT = 50;
        } else {
            costoPorTDT = 0;
        }
        return costoPorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal() + comprobarPulgadas() + comprobarTDT();
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Televisor {" + "Precio Base -> $" + precioBase + ", Color -> " + color + ", Costo por consumo --> $" + consumoEnergetico + ", Peso --> " + peso + "kg" + ", Precio Final --> $" + precioFinal();
    }

}
