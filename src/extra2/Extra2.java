/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
 *
 * @author Luciano
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
    cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
    valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
    Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
    variable auxiliar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux;
        int a=25;
        int b=100;
        int c=18;
        int d=39;
        System.out.println("Valor original");
        System.out.println("A="+a+"\nB="+b+"\nC="+c+"\nD="+d);
        System.out.println("\nCambio de valor");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("A="+a+"\nB="+b+"\nC="+c+"\nD="+d);
    }
    
}
