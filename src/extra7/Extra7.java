/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int min=0;
        int max=0;
        float promedio=0;
        int num;
        int i=0;
        Scanner leer = new Scanner(System.in);
        //WHILE
        /*System.out.println("ingrese cuantos numeros va a ingresar:");
        n=leer.nextInt();
        while(i<n){
            System.out.println("ingrese un numero:");
            num=leer.nextInt();
            if(num>0){
            if(i==0){
               max=num;
               min=num;
            }
            if(max<num)
                max=num;
            
            if(min>num){
                min=num;
            }
            promedio+=num;
        }
            i+=1;
        }
        */
        //DO-WHILE
        System.out.println("ingrese cuantos numeros va a ingresar:");
        n=leer.nextInt();
        do{
        System.out.println("ingrese un numero:");
            num=leer.nextInt();
        if(num>0){
            if(i==0){
               max=num;
               min=num;
            }
            if(max<num)
                max=num;
            
            if(min>num){
                min=num;
            }
            promedio+=num;
        }
            i+=1;
        }while(i<n);
        
        System.out.println("El valor minimo es:"+min);
        System.out.println("El valor maximo es:"+max);
        System.out.println("El promedio es:"+(promedio/n));
    }
    
}
