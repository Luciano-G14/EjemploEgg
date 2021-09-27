/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments Realice un programa que compruebe
     * si una matriz dada es anti simétrica. Se dice que una matriz A es anti
     * simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
     * signo. Es decir, A es anti simétrica si A = -AT . La matriz traspuesta de
     * una matriz A se denota por AT y se obtiene cambiando sus filas por
     * columnas (o viceversa)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int llenar;
        int i;
        int j;
        int aux;
        int cont = 0;

        System.out.println("llene a la matriz");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("MATRIZ[" + i + "][" + j + "]=");
                matriz[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                if (matriz[j][i] * (-1) == matriz[i][j]) {
                    cont = cont + 1;
                }
            }
        }
        if (cont == 9) {
            System.out.println("la matriz es anti simetrica");
        } else {
            System.out.println("la matriz NO es anti simetrica");
        }
    }

}
