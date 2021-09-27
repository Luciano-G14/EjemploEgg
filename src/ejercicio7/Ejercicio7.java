/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        num=leer.nextInt();
        System.out.println("ingrese el segundo numero:");
        num2=leer.nextInt();
        if(num>num2){
            System.out.println("El primer numero es más grande");
        }
        else{
            System.out.println("El segundo numero es más grande");
        }
            
    }
    
}
