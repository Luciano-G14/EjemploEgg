/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra18;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra18 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        boolean igual=false;
        System.out.println("Ingrese el tamaño para los vectores:");
        n=leer.nextInt();
        int[] vec1= new int[n];
        int[] vec2= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("VEC1["+i+"]=");
            vec1[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("VEC2["+i+"]=");
            vec2[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(vec1[i]==vec2[i])
                igual=true;
            else{
                igual=false;
                break;
            }
                
        }
        if(igual==true)
            System.out.println("Los dos vectores son iguales");
        else
            System.out.println("Los dos vectores NO son iguales");
    }
    
}
