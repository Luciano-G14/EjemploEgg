/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra9;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13:
* 50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo;
        int divisor;
        int resultado=0;
        int cociente=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el dividendo:");
        dividendo=leer.nextInt();
        System.out.println("ingrese el divisor");
        divisor=leer.nextInt();
       
        while(dividendo>divisor && dividendo!=1 && divisor!=1){
            resultado=dividendo-divisor;
            dividendo=resultado;
            cociente+=1;  
        }
        System.out.println("Residuo:"+resultado+"\ncociente:"+cociente);
    }
    
}
