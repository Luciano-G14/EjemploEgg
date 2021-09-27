/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tamanio;
        int i;
        int j;
        System.out.println("ingrese el tamaño del cuadrado:");
        tamanio=leer.nextInt();
        for(i=1;i<=tamanio;i++){
        for(j=1;j<=tamanio;j++){
        if((i>1)&&(i<tamanio)&&(j>1)&&(j<tamanio))
                System.out.print(" ");
        else    
                System.out.print("*");
        }
            System.out.println("");
        }
    }
    
}
