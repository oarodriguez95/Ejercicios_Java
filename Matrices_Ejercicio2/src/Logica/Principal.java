/*
Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su resultado.
 */
package Logica;

import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in);
    static int matriz[][];
    static int matriz2[][];
    static int sumaMatrices[][];
    static int nFilas = 3;
    static int nColumnas = 3;

    //METODO PRINCIPAL
    public static void main(String[] args) {


        sumarMatrices(llenarMatrizUno(),llenarMatrizDos());

    }

    //METODO PARA LLENAR LA PRIMERA MATRIZ
    public static int[][] llenarMatrizUno() {
        matriz = new int[nFilas][nColumnas];

        System.out.println("llenando la primera Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Digite el numero de la posicion (" + i + "," + j + ")--> ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }

    //METODO PARA LLENAR LA SEGUNDA MATRIZ
    public static int[][] llenarMatrizDos() {
        matriz2 = new int[nFilas][nColumnas];

        System.out.println("llenando la Segunda Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Digite el numero de la posicion (" + i + "," + j + ")--> ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        return matriz2;
    }

    public static void sumarMatrices(int[][] matriz, int[][] matriz2) {
        sumaMatrices = new int[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                sumaMatrices[i][j] = matriz[i][j]+matriz2[i][j];
            }
        }
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(sumaMatrices[i][j]+" ");
            }
        }
    }

}
