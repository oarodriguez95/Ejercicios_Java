package logica;

public enum ConsumoE {
    A(100),
    B(80),
    C(60),
    D(50),
    E(30),
    F(10);

    private double valor;

    public static ConsumoE getA() {
        return A;
    }

    public static ConsumoE getB() {
        return B;
    }

    public static ConsumoE getC() {
        return C;
    }

    public static ConsumoE getD() {
        return D;
    }

    public static ConsumoE getE() {
        return E;
    }

    public static ConsumoE getF() {
        return F;
    }

    public double getValor() {
        return valor;
    }
    
    

    private ConsumoE(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Consumo Energetico {" + "valor -> $" + valor + '}';
    }
    
    
    
}
