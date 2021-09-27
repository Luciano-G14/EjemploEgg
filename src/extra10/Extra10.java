/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe 
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para 
realizar este ejercicio investigue como utilizar la función Math.random() de Java
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int multiplicacion=num1*num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.");
        int resultado=leer.nextInt();
        while(resultado!=multiplicacion){
            if(resultado>multiplicacion){
                System.out.println("PISTA: El resultado es MENOR al numero que ingreso");
            }
            else
                System.out.println("PISTA: El resultado es MAYOR al numero que ingreso");
            
            System.out.println("Intente otra vez:");
            resultado=leer.nextInt();
            
        
        }
        System.out.println("HAS ACERTADO EL RESULTADO DE LA MULTIPLICACION");
    }
    
}
