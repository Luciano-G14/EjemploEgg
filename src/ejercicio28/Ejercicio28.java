/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments Dadas dos matrices cuadradas de
     * números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita
     * escribir un programa en el cual se compruebe si la matriz P está
     * contenida dentro de la matriz M. Para ello se debe verificar si entre
     * todas las submatrices de 3x3 que se pueden formar en la matriz M,
     * desplazándose por filas o columnas, existe al menos una que coincida con
     * la matriz P. En ese caso, el programa debe indicar la fila y la columna
     * de la matriz M en la cual empieza el primer elemento de la submatriz P
     *
     * Como podemos observar nuestra submatriz P se encuentra en la matriz M en
     * los índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        int x = 0;
        int y = 0;
        int[][] matrizm = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12},};
        int[][] matrizp = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int cont = 0;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (matrizm[i][j] == matrizp[0][0]) {
                    x = i;
                    y = j;
                    if (matrizm[i][y + 1] == matrizp[0][1] && matrizm[i][y + 2] == matrizp[0][2] && matrizm[x + 1][y] == matrizp[1][0] && matrizm[x + 1][y + 1] == matrizp[1][1] && matrizm[x + 1][y + 2] == matrizp[1][2] && matrizm[x + 2][y] == matrizp[2][0] && matrizm[x + 2][y + 1] == matrizp[2][1] && matrizm[x + 2][y + 2] == matrizp[2][2]) {
                        cont += 1;  
                    }else
                        cont=cont;
                }
            }
        }
        if (cont == 1) {
            System.out.println("La matrizP esta dentro de la otra matrizM");
            System.out.println("La matrizP empieza en la fila:" + x + " columna:" + y);
        }
        else
            System.out.println("no esta puto");
    }

}
