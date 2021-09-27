/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra15;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra15 {

    /**
     * @param args the command line arguments Diseñe una función que pida el
     * nombre y la edad de N personas e imprima los datos de las personas
     * ingresadas por teclado e indique si son mayores o menores de edad.
     * Después de cada persona, el programa debe preguntarle al usuario si
     * quiere seguir mostrando personas y frenar cuando el usuario ingrese la
     * palabra “No”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        String opcion = "";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        do{
            System.out.println("ingrese un nombre:");
            nombre = leer.next();
            System.out.println("ingrese la edad:");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Nombre:" + nombre + "\nEdad:" + edad + ".Es mayor de edad");
            } else {
                System.out.println("Nombre:" + nombre + "\nEdad:" + edad + ".No es mayor de edad");
            }
            System.out.println("¿Quiere seguir ingresando datos? Si o no");
            opcion=leer.next();
        }while (!opcion.equals("No") && !opcion.equals("no") && !opcion.equals("NO"));
    }

}
