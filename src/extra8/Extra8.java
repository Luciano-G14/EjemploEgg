/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra8 {

    /**
     * @param args the command line arguments Escriba un programa que lea
     * números enteros. Si el número es múltiplo de cinco debe detener la
     * lectura y mostrar la cantidad de números leídos, la cantidad de números
     * pares y la cantidad de números impares. Al igual que en el ejercicio
     * anterior los números negativos no deben sumarse. Nota: recordar el uso de
     * la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int sumPar = 0;
        int sumImpar = 0;
        int num;
        int cont = 0;
        while (1 < 2) {
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            if (num > 0) {
                if (num % 5 == 0) {
                    break;
                } else if (num % 2 == 0) {
                    sumPar += 1;
                } else {
                    sumImpar += 1;
                }
                cont += 1;
            }
        }
        
        System.out.println("La cantidad numeros ingresados es de:"+cont+" numeros");
        System.out.println("La cantidad de numero pares:"+sumPar+" numeros");
        System.out.println("La cantidad de numeros impares:"+sumImpar+" numeros");
    }
    }

