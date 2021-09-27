/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author Luciano
 * 
 * Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        char tipo;
        int costo;
        int descuento;
        System.out.println("Ingrese su tipo de socio:");
        tipo=leer.next().charAt(0);
        System.out.println("Ingrese el costo del tratamiento:");
        costo=leer.nextInt();
        if(tipo=='A' || tipo=='a'){
            descuento=costo*50/100;
            costo=costo-descuento;
        }else if(tipo=='B' || tipo=='b'){
            descuento=costo*25/100;
            costo=costo-descuento; 
        }
           
         System.out.println("Por ser socio tipo "+tipo+",el costo del tratamiento es de:"+costo+"$");   
        
    }
    
}
