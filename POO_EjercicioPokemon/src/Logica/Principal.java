package Logica;

public class Principal {

    public static void main(String[] args) {
        Pikachu pika = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        
        pika.atacarAraniazo();
        pika.atacarRayo();
        System.out.println("---------");
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarParalizar();
        System.out.println("---------");
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        System.out.println("---------");
        squirtle.atacarAraniazo();
        squirtle.atacarPistolaAgua();
    }

}
