package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu y su ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Pikachu y su ataque arañazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Pikachu y su ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu y su ataque de Impactar trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu y su ataque de Puño de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu y su ataque de rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu y su ataque de descarga de rayo");
    }

}
