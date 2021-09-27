/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra16;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra16 {

    /**
     * @param args the command line arguments Crea una aplicación que nos pida
     * un número por teclado y con una función se lo pasamos por parámetro para
     * que nos indique si es o no un número primo, debe devolver true si es
     * primo, sino false
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        boolean resultado;
        System.out.println("Ingrese un numero para ver si es o no primo:");
        num = leer.nextInt();
        resultado=Primo(num);
        System.out.println("El numero que ingreso es primo="+resultado);
    }

    public static boolean Primo(int num) {
        int i;
        boolean primo = false;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }else{
            primo=true;
        }
            
    }
        return primo;
}
}