package logica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreTitular;
        Cuenta c1;

        System.out.print("Ingrese su nombre --> ");
        nombreTitular = entrada.nextLine();

        c1 = new Cuenta(nombreTitular, 258900);
        System.out.println("Hola " + c1.getTitular());
        System.out.println("Su saldo actual es $" + c1.getCantidad());
        System.out.print("Marque 1 para retirar \nMarque 2 para Ingresar \n--> ");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.print("Cuanto va a retirar? --> ");
            double dinero = entrada.nextDouble();
            c1.retirarDinero(dinero);
            System.out.println("*** *** *** ***");
            System.out.println(c1);
        } else {
            System.out.print("Cuanto va a ingresar? --> ");
            double dinero = entrada.nextDouble();
            c1.ingresarDinero(dinero);
            System.out.println("*** *** *** ***");
            System.out.println(c1);
        }

    }

}
