/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        
        System.out.println("ingrese una nota del 0 al 10:");
        Scanner leer = new Scanner(System.in);
        nota=leer.nextInt();
        while((nota<0 || nota > 10)){
        System.out.println("ingrese una nota del 0 al 10:");
        nota=leer.nextInt();
        }
        System.out.println("Gracias por su nota");
    }
    
}
