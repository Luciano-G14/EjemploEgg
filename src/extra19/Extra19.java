/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra19;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra19 {

    /**
     * @param args the command line arguments Crear una función rellene un
     * vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenar(vector, n);
        ver(vector, n);

    }

    public static void llenar(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void ver(int vector[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}
