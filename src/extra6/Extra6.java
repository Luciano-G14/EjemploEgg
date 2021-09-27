/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int personas;
        double promedioG;
        double contG=0;
        double estatura;
        double promedioB;
        double contB=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cuantas personas van a ingresar su altura:");
        personas=leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("ingrese la "+(i+1)+" estatura:");
            estatura=leer.nextDouble();
            if(estatura<1.60){
            contB+=1;
            }
            contG+=estatura;
        }
        promedioG=contG/personas;
        promedioB=contB/personas*100;
        System.out.println("El promedio de personas menores a 1,60 mts es de:"+promedioB+"%");
        System.out.println("El promedio de estaturas general es de:"+promedioG+" mts");
    }
    
}
