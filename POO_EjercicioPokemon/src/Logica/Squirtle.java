package Logica;

public class Squirtle extends Pokemon implements IAgua{

    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle y su ataque placaje");    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Squirtle y su ataque de arañazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Squirtle y su ataque de mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con la hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con la pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle con hidropulsos");
    }
    
}
