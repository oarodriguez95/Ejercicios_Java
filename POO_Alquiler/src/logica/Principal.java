package logica;

import java.util.ArrayList;

public class Principal {

    static ArrayList<Serie> listaSeries = new ArrayList<>();
    static ArrayList<VideoJuego> listaJuegos = new ArrayList<>();

    public static void main(String[] args) {

        listaSeries.add(new Serie("The walking dead", 11, "Survival", "Francisco el Matematico"));
        listaSeries.add(new Serie("Betty la Fea", 84, "Romance", "Pedro infante"));
        listaSeries.add(new Serie("Nuevo Rico, Nuevo Pobre", 40, "Comedia", "Andres Toro"));
        listaSeries.add(new Serie("Pandillas Guerra y Paz", 2, "Comedia", "Ricardo Castro"));
        listaSeries.add(new Serie("The Simpsons", 38, "Animacion", "Andres Toro"));

        listaJuegos.add(new VideoJuego("The Last of Us", 35, "Zombies", "HBO"));
        listaJuegos.add(new VideoJuego("Resident Evil 4", 15, "Zombies", "Capcom"));
        listaJuegos.add(new VideoJuego("Rayman", 8, "Infantil", "SquearGames"));
        listaJuegos.add(new VideoJuego("Fifa 2023", 80, "Simulacion", "EA Sports"));
        listaJuegos.add(new VideoJuego("The Last of Us II", 30, "Zombies", "HBO"));

        listaSeries.get(4).entregar();
        listaSeries.get(1).entregar();
        listaJuegos.get(0).entregar();
        listaJuegos.get(2).entregar();

        for (VideoJuego listaJuego : listaJuegos) {
            System.out.println(listaJuego);
        }
        System.out.println("*------------*-----------*----------*");
        for (Serie serie : listaSeries) {
            System.out.println(serie);
        }

        int entregado = 0;
        for (VideoJuego juego : listaJuegos) {
            if (juego.isEntregado()) {
                entregado++;
                juego.devolver();
            }
        }
        for (Serie serie : listaSeries) {
            if (serie.isEntregado()) {
                entregado++;
                serie.devolver();
            }
        }
        System.out.println("-----*----------*-----------*-------------*");
        System.out.println("Hay un total de " + entregado + " articulos Entregados.");
        System.out.println("-----*----------*-----------*-------------*");
        System.out.println("**------ LA SERIE CON MAS TEMPORADAS ES ------**");
        System.out.println(listaSeries.get(serieConMasTemporadas()));
        System.out.println("**------ El JUEGO CON MAS HORAS ES ------**");
        System.out.println(listaJuegos.get(juegoConMasHoras()));

    }

    public static int serieConMasTemporadas() {
        int mayor = -1;
        int pos = 0;
        for (int i = 0; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).getNumTemporadas() > mayor) {
                mayor = listaSeries.get(i).getNumTemporadas();
                pos = i;
            }
        }
        return pos;
    }

    public static int juegoConMasHoras() {
        int mayor = -1;
        int pos = 0;
        for (int i = 0; i < listaJuegos.size(); i++) {
            if (listaJuegos.get(i).getHorasDeJuego() > mayor) {
                mayor = listaJuegos.get(i).getHorasDeJuego();
                pos = i;
            }
        }
        return pos;
    }

}
