package logica;

public class Lavadora extends Electrodomestico {

    private static final double DEFAULT_CARGA = 5;
    private double carga;
    
    //Constructor con todos los parametros
    public Lavadora(double carga, double precioBase, String color, double consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //Constructor por Defecto
    public Lavadora() {
        this(DEFAULT_CARGA,DEFAULT_PRECIO_BASE,DEFAULT_COLOR,DEFAULT_CONSUMO_ENERGETICO,DEFAULT_PESO);
    }
    //Constructor con precio y peso como parametros
    public Lavadora(double precioBase, double peso) {
        this(precioBase, peso,DEFAULT_COLOR,DEFAULT_CONSUMO_ENERGETICO,DEFAULT_PESO);
        this.carga = DEFAULT_CARGA;
    }

    public double getCarga() {
        return carga;
    }

    private double validarCostoPorCarga() {
        double costoCarga;
        if (this.carga > 30) {
            costoCarga = 50;
        } else {
            costoCarga = 0;
        }
        return costoCarga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal() + validarCostoPorCarga();
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Lavadora {" + "Precio Base -> $" + precioBase + ", Color -> " + color + ", Costo por consumo --> $" + consumoEnergetico + ", Peso --> " + peso + "kg" + ", Precio Final --> $" + precioFinal();
    }

}
