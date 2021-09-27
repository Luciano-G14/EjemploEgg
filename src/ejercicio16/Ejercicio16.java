/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int i;
        int num;
        int suma;
        suma=0;
        for(i=0; i<=20; i++){
            System.out.println("ingrese un numero:");
            num=leer.nextInt();
            if(num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            else if(num>0)
                suma=suma+num;
            else
                suma=suma;
                
    }
        System.out.println("La suma de los numero ingresados positivos es "+suma);
    }
    
}
