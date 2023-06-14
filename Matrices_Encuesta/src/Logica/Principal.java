package Logica;

import java.util.Scanner;

public class Principal {

    static final int ENCUESTADOS = 5;
    static final int ITEMS_ENCUESTA = 3;

    public static void main(String[] args) {
        int[][] encuesta = new int[ENCUESTADOS][ITEMS_ENCUESTA];

        hacerEncuesta(encuesta);
        mostrarResultados(encuesta);
        System.out.println("\n -> El " + porcentajeHombreoMujer(encuesta, 1) + "% de los encuestados son hombres.");
        System.out.println("-> El " + porcentajeHombreoMujer(encuesta, 2) + "% de los encuestados son mujeres.");
        System.out.println("-> El " + porcentajeConTrabajo(encuesta, 1, 1) + "% de los Hombres encuestados trabajan actualmente.");
        System.out.println("-> El " + porcentajeConTrabajo(encuesta, 2, 1) + "% de las mujeres encuestadas trabajan actualmente.");
        System.out.println("-> El sueldo promedio de las mujeres que trabajan es $"+porcentajeSueldo(encuesta, 2, 1));
        System.out.println("-> El sueldo promedio de los hombres que trabajan es $"+porcentajeSueldo(encuesta, 1, 1));
    }

    //Se formula las preguntas de la encuesta y le capturas de datos
    public static void hacerEncuesta(int[][] encuesta) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < ENCUESTADOS; i++) {
            System.out.println("Encuesta " + (i + 1));
            int cont = 0;
            while (cont < ITEMS_ENCUESTA) {
                System.out.print("Digite 1 si es HOMBRE, 2 si es MUJER --> ");
                encuesta[i][cont] = entrada.nextInt();
                cont++;
                System.out.print("Labora actualmente? Digite 1 para SI, 2 para NO --> ");
                encuesta[i][cont] = entrada.nextInt();
                cont++;
                System.out.print("Sueldo Devengado --> $");
                encuesta[i][cont] = entrada.nextInt();
                cont++;
            }
        }
    }

    public static void mostrarResultados(int[][] encuesta) {
        System.out.println("Resultados Obtenidos");
        System.out.println("Genero | Empleado Actualmente | Sueldo Devengado");
        for (int i = 0; i < ENCUESTADOS; i++) {
            System.out.println("--* Persona " + (i + 1));
            for (int j = 0; j < ITEMS_ENCUESTA; j++) {
                System.out.print(encuesta[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    public static int porcentajeHombreoMujer(int[][] encuesta, int genero) {
        int cont = 0;
        for (int i = 0; i < ENCUESTADOS; i++) {
            if (encuesta[i][0] == genero) {
                cont++;
            }
        }

        int porcentaje = (cont * 100) / ENCUESTADOS;
        return porcentaje;
    }

    public static int porcentajeConTrabajo(int[][] encuesta, int genero, int trabajaActualmente) {
        int cont = 0;
        for (int i = 0; i < ENCUESTADOS; i++) {
            if (encuesta[i][0] == genero && encuesta[i][1] == trabajaActualmente) {
                cont++;
            }
        }
        int porcentaje = (cont * 100) / ENCUESTADOS;
        return porcentaje;
    }

    public static double porcentajeSueldo(int[][] encuesta, int genero, int trabajaActualmente) {
        int cont = 0;
        int suma = 0;
        double promedioSueldo = 0;
        for (int i = 0; i < ENCUESTADOS; i++) {
            if (encuesta[i][0] == genero && encuesta[i][1] == trabajaActualmente) {
                suma = suma + encuesta[i][2];
                cont++;
            }
        }
        promedioSueldo = (double) suma / cont;
        return promedioSueldo;
    }

}
