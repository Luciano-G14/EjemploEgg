/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        String subcadenax;
        String subcadenao;
        int longitud;
        int correcto=0;
        int incorrecto=0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("ingrese una frase:");
            cadena=leer.next();
            longitud=cadena.length();
            subcadenax=cadena.substring(0,1);
            subcadenao=cadena.substring(longitud-1,longitud);
           
            if(longitud==5 && subcadenax.equals("X") && subcadenao.equals("O")){
            correcto+=1;
            }else
            incorrecto+=1;
        }while(!cadena.equals("&&&&&"));
    
        System.out.println("Lecturas Correctas:"+correcto);
        System.out.println("Lecturas Incorrectas:"+(incorrecto-1));
    }
    
}
