/*
Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 */
package Logica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matrizTrans[][] = new int[3][3];

        //LLENANDO LA MATRIZ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento (" + i + "," + j + ")--> ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //MOSTRANDO LA MATRIZ ORIGINAL
        System.out.println("\nMatriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        //MOSTRANDO LA MATRIZ TRANSPUESTA
        System.out.println("\nMatriz Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.print("\n");
        }

    }

}
