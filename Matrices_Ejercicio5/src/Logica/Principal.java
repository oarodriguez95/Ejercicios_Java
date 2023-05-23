/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
*/
package Logica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][];
        int nFilas, nColumnas;
        int sumaFilas = 0;
        int sumaColumnas = 0;

        System.out.print("Digite el numero de Filas --> ");
        nFilas = entrada.nextInt();
        System.out.print("Digite el numero de Columnas --> ");
        nColumnas = entrada.nextInt();

        matriz = new int[nFilas][nColumnas];

        System.out.println("Llenando la Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Digite el elemento --> ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        //SUMANDO LAS FILAS
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas = sumaFilas + matriz[i][j];
            }
            System.out.println("Suma de la Fila (" + (i) + "): " + sumaFilas);
        }
        //SUMANDO LAS COLUMNAS
        for (int i = 0; i < nFilas; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaColumnas = sumaColumnas + matriz[j][i];
            }
            System.out.println("Suma de la columna (" + (i) + "): " + sumaColumnas);
        }
    }

}
