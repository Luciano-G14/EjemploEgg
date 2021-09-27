/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra4 {

    /**
     * @param args the command line arguments Elaborar un algoritmo en el cuál
     * se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero del uno al diez para ver su equivalencia en numeros romanos:");
        num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El numero " + num + " en romano es I");
                break;
            case 2:
                System.out.println("El numero " + num + " en romano es II");
                break;
            case 3:
                System.out.println("El numero " + num + " en romano es III");
                break;
            case 4:
                System.out.println("El numero " + num + " en romano es IV");
                break;
            case 5:
                System.out.println("El numero " + num + " en romano es V");
                break;
            case 6:
                System.out.println("El numero " + num + " en romano es VI");
                break;
            case 7:
                System.out.println("El numero " + num + " en romano es VII");
                break;
            case 8:
                System.out.println("El numero " + num + " en romano es VIII");
                break;
            case 9:
                System.out.println("El numero " + num + " en romano es IX");
                break;
            case 10:
                System.out.println("El numero " + num + " en romano es X");
                break;
            default:
                System.out.println("Has ingresado un numero fuera de rango");
                
        }
    }

}
