/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        System.out.println("ingrese la frase:");
        Scanner leer= new Scanner(System.in);
        nombre=leer.next();
        if(nombre.equals("eureka")){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
