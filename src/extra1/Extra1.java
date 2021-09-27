/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra1 {

    /**
     * @param args the command line arguments Dado un tiempo en minutos,
     * calcular su equivalente en días y horas. Por ejemplo, si el usuario
     * ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
     * horas
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese minutos:");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int dia = 0;
        while (horas >= 24) {
            dia = dia + 1;
            horas = horas - 24;
        }

        if (dia > 1 && horas > 1) {
            System.out.println(dia + " dias " + horas + " horas");
        } else if (dia == 1 && horas == 0) {
            System.out.println(dia + " dia");
        } else if (dia == 1 && horas == 1) {
            System.out.println(dia + " dia " + horas + " hora");
        } else if (dia == 1 && horas != 1) {

            System.out.println(dia + " dia " + horas + " horas");
        } else if (horas == 1) {
            System.out.println(horas + " hora");
        } else {
            System.out.println(horas + " horas");
        }

    }

}
