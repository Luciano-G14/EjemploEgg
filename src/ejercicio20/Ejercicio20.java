/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio20 {

    /**
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int i;
        int j;
        for(i=0;i<4;i++){
        System.out.println("ingrese un numero entre 1 y 20:");
        num=leer.nextInt();
        if(num>=1 && num<=20){
        System.out.print(num);
        for(j=0;j<num;j++){
            System.out.print("*");
        }
        }else{
            System.out.println("has ingresado un numero fuera de rango");
        }
            System.out.println("");
        }
       
    }
    
}
