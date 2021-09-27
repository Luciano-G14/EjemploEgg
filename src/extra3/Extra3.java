/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
    vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
    clase String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letra;
        int longitud;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        letra=leer.next();
        longitud=letra.length();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra que ingreso es una VOCAL");
        }else if(longitud!=1)
            System.out.println("Has ingresado mal la letra");
        else
            System.out.println("La letra que ingreso No es una vocal");
    
    }
    
}
