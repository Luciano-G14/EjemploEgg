/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra23;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[9];
        fibonacci(vector);

    }

    public static void fibonacci(int vector[]) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < 9; i++) {
            if (i >= 1) {
                int suma = num1;
                num1 = num2;
                num2 = suma + num1;
            }
            vector[i] = num2;
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(vector[i] + " ");
        }

    }
}
