/*
Ejercicio 4: 
Hacer una matriz 7x7 y hacer que la diagonal principal sea 1 y el resto 0
*/
package Logica;

public class Principal {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }else{
                     matriz[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
}
