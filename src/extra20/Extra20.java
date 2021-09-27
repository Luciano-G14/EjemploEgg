/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra20;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra20 {

    /**
     * @param args the command line arguments Los profesores del curso de
     * programación de Egg necesitan llevar un registro de las notas adquiridas
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y
     * desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas,
     * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
     * de cada nota son: Primer trabajo práctico evaluativo 10% Segundo trabajo
     * práctico evaluativo 15% Primer Integrador 25% Segundo integrador 50% Una
     * vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
     * Al final del programa los profesores necesitan obtener por pantalla la
     * cantidad de aprobados y desaprobados, teniendo en cuenta que solo
     * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del
     * curso.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] vector = new double[10];
        Scanner leer = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int aprobados = 0;
        int desaprobados = 0;
        double promedio;
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno Nº" + (i + 1));
            System.out.println("ingrese la nota del primer trabajo practico evaluativo:");
            nota1 = leer.nextInt();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("ingrese nuevamente la nota del primer trabajo practico evaluativo:");
                nota1 = leer.nextInt();
            }

            System.out.println("ingrese la nota del segundo trabajo practico evaluativo:");
            nota2 = leer.nextInt();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("ingrese nuevamente la nota del segundo trabajo practico evaluativo:");
                nota2 = leer.nextInt();
            }
            System.out.println("ingrese la nota del primer integrador:");
            nota3 = leer.nextInt();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("ingrese nuevamente la nota del primer integrador:");
                nota3 = leer.nextInt();
            }
            System.out.println("ingrese la nota del segundo integrador:");
            nota4 = leer.nextInt();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("ingrese nuevamente la nota del segundo integrador:");
                nota4 = leer.nextInt();
            }
            promedio = ((nota1 * 10 / 100.0) + (nota2 * 15 / 100.0) + (nota3 * 25 / 100.0) + (nota4 * 50 / 100.0));
            System.out.println(promedio);
            vector[i] = promedio;
            if (vector[i] >= 7.0) {
                aprobados += 1;
            } else {
                desaprobados += 1;
            }
        }
        System.out.println("Aprobados:" + aprobados + "\nDesaprobados:" + desaprobados);
    }

}
