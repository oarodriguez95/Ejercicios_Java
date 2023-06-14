package logica;

public class Principal {

    public static void main(String[] args) {
        Libro libro1 = new Libro("1571742883", "Autism", "Stephanie Marohn", 478);
        Libro libro2 = new Libro(" 764526413", "Cien años de soledad", "Gabriel Garcia Marquez", 300);
        
        System.out.println("Acontinuacion el libro con mas paginas...");
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println(libro1);
        }else{
            System.out.println(libro2);
        }
    }
    
}
