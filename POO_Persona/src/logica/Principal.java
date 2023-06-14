package logica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Persona p1;
        Persona p2;
        Persona p3;

        p1 = new Persona("Oscar", 28, "g", 87, 1.69);
        p1.comprobarSexo();

        p2 = new Persona("Adriana", 25, "M", 59, 1.68);
        p2.comprobarSexo();

        p3 = new Persona("Omar", 15, "9", 25, 2);
        p3.comprobarSexo();

        System.out.println(p1);
        imprimirEdad(p1.esMayordeEdad());
        imprimirEstadoSalud(p1.calcularIMC());
        System.out.println("**---------**-----------**");
        System.out.println(p2);
        imprimirEdad(p2.esMayordeEdad());
        imprimirEstadoSalud(p2.calcularIMC());
        System.out.println("**---------**-----------**");
        System.out.println(p3);
        imprimirEdad(p3.esMayordeEdad());
        imprimirEstadoSalud(p3.calcularIMC());
    }

    public static void imprimirEstadoSalud(int imc) {
        if (imc == 0) {
            System.out.println("Peso Ideal...");
        } else if (imc == 1) {
            System.out.println("SobrePeso...");
        } else {
            System.out.println("InfraPeso...");
        }
    }
    
    public static void imprimirEdad(boolean edad){
        if (edad) {
            System.out.println("Es mayor de edad...");
        }else{
            System.out.println("No es mayor de edad...");
        }
    }

}
