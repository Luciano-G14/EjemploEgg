/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra17;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra17 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int cont=0;
        System.out.println("ingrese el tamaño del vector:");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("VEC["+i+"]=");
            vector[i]=leer.nextInt();
            cont+=vector[i];
        }
        System.out.println("La suma de todos los elementos del vector es:"+cont);
    }
    
}
