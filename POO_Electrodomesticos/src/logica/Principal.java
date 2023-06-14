package logica;

import java.util.ArrayList;

public class Principal {

    static ArrayList<Electrodomestico> listaE = new ArrayList<>();

    public static void main(String[] args) {

        Electrodomestico e;

        listaE.add(new Electrodomestico(200, Color.ROJO.toString(), ConsumoE.C.getValor(), 60));
        listaE.add(new Lavadora(150, 30));
        listaE.add(new Televisor(42, false, 500, Color.NEGRO.toString(), ConsumoE.E.getValor(), 80));
        listaE.add(new Electrodomestico());
        listaE.add(new Lavadora(40, 300, Color.BLANCO.toString(), Lavadora.DEFAULT_CONSUMO_ENERGETICO, 40));
        listaE.add(new Electrodomestico(200, Color.GRIS.toString(), ConsumoE.D.getValor(), 20));
        listaE.add(new Televisor(250, 70));
        listaE.add(new Lavadora(100, 400, Color.AZUL.toString(), ConsumoE.A.getValor(), 15));
        listaE.add(new Televisor(60, true, 200, Color.NEGRO.toString(), ConsumoE.C.getValor(), 30));
        listaE.add(new Electrodomestico(100, 50));

        mostrarLista();
        System.out.println("");
        sumarListas();
        System.out.println("");
    }

    public static void sumarListas() {
        double sumaElectrodomestico = 0;
        double sumaLavadora = 0;
        double sumaTelevisor = 0;
        for (Electrodomestico articulo : listaE) {
            if (articulo instanceof Electrodomestico) {
                sumaElectrodomestico += articulo.precioFinal();
            }
            if (articulo instanceof Lavadora) {
                sumaLavadora += articulo.precioFinal();
            }
            if (articulo instanceof Televisor) {
                sumaTelevisor += articulo.precioFinal();
            }
        }
        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomestico);
        System.out.println("La suma del precio de las lavadoras es de " + sumaLavadora);
        System.out.println("La suma del precio de las televisiones es de " + sumaTelevisor);

    }

    public static void mostrarLista() {
        for (Electrodomestico electrodomestico : listaE) {
            System.out.println(electrodomestico);
        }

    }

}
