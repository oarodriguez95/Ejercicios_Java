package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {

    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Bulbasaur y su ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Bubasaur y su ataque de arañazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Bulbasaur y su ataque de mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur y su ataque paralizador");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur y su ataque de drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur y su hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur y su ataque de latigo");
    }

}
