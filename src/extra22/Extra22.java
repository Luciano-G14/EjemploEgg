/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra22;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra22 {

    /**
     * @param args the command line arguments Construya un programa que lea 5
     * palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las
     * va ingresando, construya una “sopa de letras para niños” de tamaño de 20
     * x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en
     * una fila que será seleccionada de manera aleatoria. Una vez concluida la
     * ubicación de las palabras, rellene los espacios no utilizados con un
     * número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
     * letras creada. Nota: Para resolver el ejercicio deberá investigar cómo se
     * utilizan las siguientes funciones de Java substring(), Length() y
     * Math.random()
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        String numCadena;
        int longitud;
        int fila;
        int columna;
        String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "0";
            }
        }
        //ACA IRIA EL FOR(int=0;i<5;i++)
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese una palabra:");
            palabra = leer.next();
            longitud=palabra.length();
            while(longitud < 3 || longitud > 5) {
                System.out.println("ingrese una palabra nuevamente:");
                palabra = leer.next();
            }
            palabra=palabra.toUpperCase();
            fila = (int) (Math.random() * 20);
            columna = (int) ((Math.random() * (19 - longitud)));
            for (int j = columna; j < columna + longitud; j++) {
                matriz[fila][j] = palabra.substring(j - columna, j - columna + 1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j].equals("0")){
                    int random=(int)(Math.random()*10);
                    numCadena= String.valueOf(random);
                    matriz[i][j]=numCadena;
                }
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
