/*
Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
*/
package Logica;

import java.util.Scanner;

public class Principal { 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean mSimetrica = true;
        int matriz[][]; 
        int nFilas, nColumnas;

        System.out.print("Digite el numero de filas --> ");
        nFilas = entrada.nextInt();
        System.out.print("Digite el numero de columnas --> ");
        nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas];
        System.out.println("");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Digite el numero de la posicion (" + i + "," + j + ")--> ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        if (nFilas == nColumnas) {
            int i = 0 ;
            while(i<nFilas && mSimetrica == true){
                int j = 0;
                while(j<nColumnas && mSimetrica == true){
                    if (matriz[i][j] != matriz[j][i]) {
                        mSimetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (mSimetrica == true) {
                System.out.println("La matriz ingresada SI es simetrica");
            }else{
                System.out.println("La matriz ingresada NO es simetrica");
            }
        }else{
            System.out.println("La matriz ingresada NO es Simetrica.");
        }

    }
}
