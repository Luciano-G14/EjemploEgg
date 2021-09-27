/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int[] vector= new int[10];
        int i;
        int llenar;
        int intentos=0;
        System.out.println("ingrese un numero a buscar en el vector:");
        int num=leer.nextInt();
        for ( i = 0; i < 10; i++) {
           llenar=(int)(Math.random()*2);
           vector[i]=llenar;
           if(num==vector[i] && intentos>=1)
                   System.out.print(","+i);
           else if(num==vector[i] && intentos==0){
                System.out.print("el numero que ingreso fue encontrado, esta en la posicion "+i);
           intentos+=1;
   
        }
        }
    }
    
}
