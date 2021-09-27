/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra21;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las filas de la matriz:");
        int n=leer.nextInt();
        System.out.println("Ingrese la columnas de la matriz:");
        int m=leer.nextInt();
        int suma=0;
        int[][] matriz= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               matriz[i][j]=(int)(Math.random()*10);
               suma+=matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es:"+suma);
        
    }
    
}
