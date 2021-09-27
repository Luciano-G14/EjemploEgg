/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz[][]= new int [3][3];
        int i;
        int j;
        int sumafilas=0;
        int sumaAnteriorfilas=0;
        int contfilas=0;
        int sumacolumnas=0;
        int sumaAnteriorcolumnas=0;
        int contcolumnas=0;
        int sumadiagonalprincipal=0;
        int sumadiagonalsecundario=0;
        
        
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.println("MATRIZ["+i+"]["+j+"]=");
            matriz[i][j]=leer.nextInt();
        }
        }
        for(i=0;i<3;i++){//filas
           sumafilas=0; 
            for(j=0;j<3;j++){
                sumafilas=sumafilas+matriz[i][j];
        }
            if(i==0){
                sumaAnteriorfilas=sumafilas;
            }
            if(sumaAnteriorfilas==sumafilas){
                contfilas=contfilas+1;
            }
        }
        for(i=0;i<3;i++){//columnas
           sumacolumnas=0; 
            for(j=0;j<3;j++){
                sumacolumnas=sumacolumnas+matriz[j][i];
        }
            if(i==0){
                sumaAnteriorcolumnas=sumacolumnas;
            }
            if(sumaAnteriorcolumnas==sumacolumnas){
                contcolumnas=contcolumnas+1;
            }
        }
        for(i=0;i<3;i++){//diagonal principal y secundaria
        for(j=0;j<3;j++){
        if(i==j)
            sumadiagonalprincipal=sumadiagonalprincipal+matriz[i][j];
        if(i+j==3-1)
            sumadiagonalsecundario=sumadiagonalsecundario+matriz[i][j];
        }
        }
        if((contcolumnas==3) && (contfilas==3) && (sumadiagonalprincipal==sumadiagonalsecundario) && (sumafilas==sumacolumnas) && (sumacolumnas==sumadiagonalprincipal))
            System.out.println("La matriz es magica");
        else
            System.out.println("la matriz no es magica");
        
    }
    
}
