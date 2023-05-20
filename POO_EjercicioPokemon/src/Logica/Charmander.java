package Logica;

public class Charmander extends Pokemon implements IFuego{

    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander y su ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Charmander y su ataque de Arañazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Charmander y su ataque de mordizco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca con puño de fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander y su ataque lanzallamas");
    }
    
}
