/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double C;
        double F;
        System.out.println("ingrese grados centigrados:");
        Scanner leer = new Scanner(System.in);
        C=leer.nextDouble();
        F=32+(9*C/5);
        System.out.println("Fº="+F);
    }
    
}
