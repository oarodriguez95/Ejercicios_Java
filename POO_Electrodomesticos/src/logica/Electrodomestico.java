package logica;

public class Electrodomestico {
    //variables constantes y de la clase
    protected static final String DEFAULT_COLOR = Color.BLANCO.toString();
    protected static final double DEFAULT_CONSUMO_ENERGETICO = ConsumoE.F.getValor();
    protected static final double DEFAULT_PRECIO_BASE = 100;
    protected static final double DEFAULT_PESO = 5;
    //Atributos de la clase ELECTRODOMESTICO
    protected double precioBase;
    protected String color;
    protected double consumoEnergetico;
    protected double peso;

    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Electrodomestico(double precioBase, String color, double consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //CONSTRUCTOR POR DEFECTO
    public Electrodomestico() {
        this.precioBase = DEFAULT_PRECIO_BASE;
        this.color = DEFAULT_COLOR;
        this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
        this.peso = DEFAULT_PESO;
    }

    //CONSTRUCTOR MIXTO
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = DEFAULT_COLOR;
        this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
    }

    public void comprobarConsumo(double consumo) {
        char letra;

    }

    public double obtenerTamanio() {
        double costoTamanio = 0;
        if (this.peso <= 0 && this.peso > 20) {
            costoTamanio = 10;
        } else if (this.peso <= 20 && this.peso > 50) {
            costoTamanio = 50;
        } else if (this.peso <= 50 && this.peso > 79) {
            costoTamanio = 80;
        } else if (this.peso <= 80) {
            costoTamanio = 100;
        }
        return costoTamanio;
    }

    public double precioFinal() {
        double precioFinal = obtenerTamanio() + precioBase;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico {" + "Precio Base -> $" + precioBase + ", Color -> " + color + ", Costo por consumo --> $" + consumoEnergetico + ", Peso --> " + peso + "kg";
    }

}
