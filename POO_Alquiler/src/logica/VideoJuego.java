package logica;

public class VideoJuego implements Entregable {

    //Atributos
    private String titulo;
    private int horasDeJuego;
    private String genero;
    private String compañia;
    private boolean entregado;

    //Constructor con todos los parametros
    public VideoJuego(String titulo, int horasDeJuego, String genero, String compañia) {
        this.titulo = titulo;
        this.horasDeJuego = horasDeJuego;
        this.genero = genero;
        this.compañia = compañia;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getHorasDeJuego() {
        return horasDeJuego;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasDeJuego(int horasDeJuego) {
        this.horasDeJuego = horasDeJuego;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Informacion del Juego: \n"
                + "\tTitulo: " + this.titulo + "\n"
                + "\tHoras de juego: " + this.horasDeJuego + "\n"
                + "\tGenero: " + this.genero + "\n"
                + "\tCompañia: " + this.compañia;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
}
