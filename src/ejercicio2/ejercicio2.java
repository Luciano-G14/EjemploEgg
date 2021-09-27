package ejercicio2;

import java.util.Scanner;


public class ejercicio2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
       int num2;
        System.out.println("ingrese el primer numero:");
        num= leer.nextInt();
        System.out.println("ingrese el segundo numero:");
        num2=leer.nextInt();
        int suma= num+num2;
        System.out.println("La suma de los numeros es "+suma);
    }
}
