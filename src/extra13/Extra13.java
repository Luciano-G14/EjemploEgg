/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra13;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra13 {

    /**
     * @param args the command line arguments 
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba
     * un programa que pida la cantidad de familias y para cada familia la
     * cantidad de hijos para averiguar la media de edad de los hijos de todas
     * las familias
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int familias;
        int hijos;
        int contH=0;
        int media=0;
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        familias=leer.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia Nº"+(i+1));
            hijos=leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo/a:");
                edad=leer.nextInt();
                contH+=1;
                media+=edad;
            }
        }
        System.out.println("La edad media de los hijos es:"+(media/contH)+" años");
    }

}
