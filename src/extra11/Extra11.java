/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra11;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int digitos=0;
        int division;
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        while(num!=0){
        division=num/10;
        num=division;
        digitos+=1;
        }
        System.out.println("El numero que ingreso tiene "+digitos+" digitos");
    }
    
}
