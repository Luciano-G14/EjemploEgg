/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

/**
 *
 * @author Luciano
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[]= new int[5];
        int llenar;
        int i;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        for ( i = 0; i < 5; i++) {
            llenar=(int)(Math.random()*100000);
            vector[i]=llenar;
            if(vector[i]>=10000)
                cont5+=1;
            else if(vector[i]>=1000)
                cont4+=1;
            else if(vector[i]>=100)
                cont3+=1;
            else if(vector[i]>=10)
                cont2+=1;
            else
                cont1+=1;
        }
        for(i=0; i<5;i++){
            System.out.println(vector[i]);
        }
        System.out.println("numeros de 1 digito:"+cont1);
        System.out.println("numeros de 2 digitos:"+cont2);
        System.out.println("numeros de 3 digitos:"+cont3);
        System.out.println("numeros de 4 digitos:"+cont4);
        System.out.println("numeros de 5 digitos:"+cont5);
    
    }
    
}
