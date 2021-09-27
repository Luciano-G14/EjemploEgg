package ejercicio3;

import java.util.Scanner;


public class ejercicio3 {

    
    public static void main(String[] args) {
        String nombre;
        System.out.println("ingrese su nombre, por favor:");
        Scanner leer = new Scanner(System.in);
        nombre=leer.nextLine();
        System.out.println("Tu nombre es "+nombre);
    }
    
}

