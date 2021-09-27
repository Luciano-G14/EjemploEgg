/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments Crea una aplicación que a través
     * de una función nos convierta una cantidad de euros introducida por
     * teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
     * función tendrá como parámetros, la cantidad de euros y la moneda a
     * converir que será una cadena, este no devolverá ningún valor y mostrará
     * un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
     * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros:");
        int euro = leer.nextInt();
        System.out.println("Ingrese a que divisa quiere convertir:");
        String divisa = leer.next();
        cambioDivisas(euro, divisa);
    }

    public static void cambioDivisas(int euro, String divisa) {
        switch (divisa) {
            case "dolares":
                double dolar = 1.28611 * euro;
                System.out.println("CONVERSION DE EURO A DOLAR:" + dolar + "$");
                break;
            case "libras":
                double libra = 0.86 * euro;
                System.out.println("CONVERSION DE EURO A LIBRAS:" + libra + "£");
                break;
            case "yenes":
                double yenes = 129.852 * euro;
                System.out.println("CONVERSION DE EURO A YENES:" + yenes + "¥");
                break;

            default:
                System.out.println("Esa divisa no esta aqui");
        }
    }

}
