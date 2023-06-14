package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String turno = "X";
        boolean ganador = false;
        boolean tableroLleno = false;
        String[] tablero = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

        while (!ganador && !tableroLleno) {

            mostrarTablero(tablero); //Mostrar el tablero
            jugarTurno(turno, tablero); //Jugar el turno X o O
            ganador = evaluarGanador(tablero); //Evaluar si en ese turno hubo ganador

            if (ganador) {
                mostrarTablero(tablero);
                System.out.println("FELICIDADES JUGADOR " + turno + "\nHas Ganado.");
            }

            turno = cambiarTurno(turno); //Si no hay ganador aun, se cambia el turno
            tableroLleno = comprobarTableroLleno(tablero);  //Evaluar si el tablero se llenó sin ganador alguno

            if (tableroLleno) {
                mostrarTablero(tablero);
                System.out.println("ATENCION: No hubo Ganador, Juego finalizado.");
            }
        }
    }

    public static boolean comprobarTableroLleno(String[] tablero) {
        if (!tablero[0].equals("-")
                && !tablero[1].equals("-")
                && !tablero[2].equals("-")
                && !tablero[3].equals("-")
                && !tablero[4].equals("-")
                && !tablero[5].equals("-")
                && !tablero[6].equals("-")
                && !tablero[7].equals("-")
                && !tablero[8].equals("-")) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarTablero(String[] tablero) {
        System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ");
        System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ");
        System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ");
        System.out.println("");
    }

    public static void jugarTurno(String simbolo, String[] tablero) {
        System.out.print("jugador " + simbolo + ", digite la posicion del tablero donde quiere jugar su turno --> ");
        int posicion = entrada.nextInt();
        System.out.println("");
        //Evitando que se sobreescriba la casilla ya jugada
        while (!tablero[posicion - 1].equals("-")) {
            System.out.print("la casilla ya esta ocupada. Elija otra --> ");
            posicion = entrada.nextInt();
        }

    }

    public static String cambiarTurno(String simbolo) {
        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        return simbolo;
    }

    public static boolean evaluarGanador(String[] tablero) {
        if (tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("-")) {
            return true;
        } else if (tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("-")) {
            return true;
        } else if (tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("-")) {
            return true;
        } else if (tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("-")) {
            return true;
        } else if (tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("-")) {
            return true;
        } else if (tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("-")) {
            return true;
        } else if (tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("-")) {
            return true;
        } else if (tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("-")) {
            return true;
        } else {
            return false;
        }
    }
}
