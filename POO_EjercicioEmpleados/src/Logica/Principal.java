package Logica;

import java.util.ArrayList;

public class Principal {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {

        agregarEmpleados();
        //Mostrando los resultados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Empleado No"+(i+1));
            System.out.println(empleados.get(i));
            empleados.get(i).Plus();
            System.out.println("--*--*--*--*--*");
        }

    }
    
    public static void agregarEmpleados(){
        empleados.add(new EComercial("Oscar","Rodriguez",31,380,201));
        empleados.add(new EComercial("Oscar","Gomez",29,380,201));
        empleados.add(new ERepartidor("Ever", "apellido", 24, 500, "Zona 3"));
    }

}
