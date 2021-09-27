/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

/**
 *
 * @author Luciano
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][]= new int [4][4];
        int llenar;
        int i;
        int j;
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
        llenar=(int)(Math.random()*10);
        matriz[i][j]=llenar;
        }
        }
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            System.out.print(matriz[i][j]+" ");
        }
            System.out.println("");
        }
    }
    
}
