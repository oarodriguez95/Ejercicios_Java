package logica;

public class Serie implements Entregable {

    //Constantes
    private static final int DEFAULT_NUM_TEMPORADAS = 3;
    private static final boolean DEFAULT_ENTREGADO = false;
    //Atributos
    private String titulo;
    private int numTemporadas;
    private String genero;
    private String creador;
    private boolean entregado;

    //Constructor con todos los atributos
    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Informacion de la Serie: \n"
                + "\tTitulo: " + titulo + "\n"
                + "\tNumero de temporadas: " + numTemporadas + "\n"
                + "\tGenero: " + genero + "\n"
                + "\tCreador: " + creador;
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
