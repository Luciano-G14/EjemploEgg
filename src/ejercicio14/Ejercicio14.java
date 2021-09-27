/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
    import java.util.Scanner;
/**
 *
 * @author Luciano
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorLimite;
        int suma;
        int num;
        suma=0;
        System.out.println("ingrese el valor limite:");
        Scanner leer = new Scanner(System.in);
        valorLimite= leer.nextInt();
        while(suma<=valorLimite){
            System.out.println("ingrese numeros hasta que la sumas de esos numeros pasen el valor limite:");
            num=leer.nextInt();
            suma=suma+num;
        }
        System.out.println("Fin del ciclo");
    }
    
}
