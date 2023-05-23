/* 
Ejercicio 6: UTILIZANDO DOS MATRICES n*m Y m*n
CARGAR LA PRIMERA Y TRASPONERLA EN LA SEGUNDA 
*/
package Logica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nFilas, nColumnas;
        int matriz[][];
        int matrizTrans[][];

        System.out.print("Digite el numero de Filas --> ");
        nFilas = entrada.nextInt();
        System.out.println("Digite el numero de Columnas --> ");
        nColumnas = entrada.nextInt();

        matriz = new int[nFilas][nColumnas];
        matrizTrans = new int[nColumnas][nFilas];

        //LLenando la Matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Digite el elemento (" + i + "," + j + ")--> ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < nColumnas; i++) {
            for (int j = 0; j < nFilas; j++) {
                matrizTrans[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz Original");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < nColumnas; i++) {
            for (int j = 0; j < nFilas; j++) {
                System.out.print(matrizTrans[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
