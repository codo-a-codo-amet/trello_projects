
package javaapplication104;

import java.util.Scanner;


public class JavaApplication104 {

    
    public static void main(String[] args) {
        
       int valor=0;         
       Scanner entrada=new Scanner (System.in);
        
        while (valor<5) { 
            
            System.out.println("Ingresar valor");
            int num=entrada.nextInt();
            System.out.println(num);
            valor++;
        }
    }

}       
    
    
    
