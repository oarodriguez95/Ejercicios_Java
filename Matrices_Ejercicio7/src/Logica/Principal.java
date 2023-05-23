/*
Ejercicio 7: Crear una matriz “marco” de tamaño 5x5: 
todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.
 */
package Logica;

public class Principal {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == (5 - 1)) {
                    matriz[i][j] = 1;
                } else if (j == 0 || j == (5 - 1)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }

    }

}
