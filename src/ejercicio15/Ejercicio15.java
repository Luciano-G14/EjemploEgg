/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author Luciano
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num1;
        int num2;
        int menu;
        String salir="";
        System.out.println("ingrese el primer numero:");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero:");
        num2=leer.nextInt();
        
        System.out.println("Menu:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir\n5)Salir");
        menu=leer.nextInt();
       while(!salir.equals("S")){
        if(menu==1)
                System.out.println("la suma de los numeros es "+(num1+num2));
        System.out.println("Menu:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir\n5)Salir");
        menu=leer.nextInt();
        if(menu==2)
                System.out.println("La resta de los numero es "+(num1-num2));
        System.out.println("Menu:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir\n5)Salir");
        menu=leer.nextInt();
        if(menu==3)
                System.out.println("La multiplicacion de los numero es "+(num1*num2));
        System.out.println("Menu:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir\n5)Salir");
        menu=leer.nextInt();
        if(menu==4)
                System.out.println("La division de los numero es "+(num1/num2));
        System.out.println("Menu:\n1)Sumar\n2)Restar\n3)Multiplicar\n4)Dividir\n5)Salir");
        menu=leer.nextInt();
        if(menu==5){
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salir=leer.next();
        }
       }
        
    }
    
}
