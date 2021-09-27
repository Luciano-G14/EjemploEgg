/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author Luciano
 */
public class Ejercicio18 {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo:
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < 10; i++) {
            String numCadena= String.valueOf(i);
            for (j = 0; j < 10; j++) {
                String numCadena2= String.valueOf(j);
                for (k = 0; k < 10; k++) {
                    String numCadena3= String.valueOf(k);
                    if (numCadena.equals("3")) {
                        numCadena="E";
                        System.out.println(numCadena + "-" + j + "-" + k);
                    } else if (numCadena2.equals("3")) {
                        numCadena2="E";
                        System.out.println(i + "-" + numCadena2 + "-" + k);
                    } else if (numCadena3.equals("3")) {
                        numCadena3="E";
                        System.out.println(i + "-" + j + "-" + numCadena3);

                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }

                }
            }
        }
    }
}
