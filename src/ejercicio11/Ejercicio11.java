/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        String subcadena;
        System.out.println("ingrese una frase o palabra:");
        Scanner leer = new Scanner(System.in);
        frase=leer.nextLine();
        subcadena=frase.substring(0,1);
        System.out.println(subcadena);
        if(subcadena.equals("A")){
            System.out.println("CORRECTO");
        }
         else {
            System.out.println("INCORRECTO");
        }
    }
}
