/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra14;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
    sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
    operación matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        int resultado;
        double resultado2;
        System.out.println("ingrese el primer numero:");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero;");
        num2=leer.nextInt();
        System.out.println("Elija una de estas opciones:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir");
        opcion=leer.nextInt();
        switch (opcion) {
            case 1:
                    resultado=Sumar(num1,num2);
                    System.out.println("La suma de los dos numero es:"+resultado);
                break;
            case 2:
                     resultado=Restar(num1,num2);
                     System.out.println("La resta de los dos numero es:"+resultado);
                break;
            case 3:
                    resultado=Multiplicar(num1,num2);
                    System.out.println("La multiplicacion de los dos numero es:"+resultado);
                break;
            case 4:
                    resultado2=Dividir(num1,num2);
                    System.out.println("La division de los dos numero es:"+resultado2);
                    
                break;    
            default:
                System.out.println("Esta opcion no existe");
        }
        
    }
    public static int Sumar(int num1,int num2){
    int resultado;
    resultado=num1+num2;
        return resultado;
    
    
    }
    public static int Restar(int num1,int num2){
    
    int resultado;
    resultado=num1-num2;
        return resultado;
    
    }
    public static int Multiplicar(int num1,int num2){
    
    int resultado;
    resultado=num1*num2;
        return resultado;
    
    }
    public static double Dividir(int num1,int num2){
    
    double resultado;
    resultado=(double)num1/num2;
        return resultado;
    
    }
}
