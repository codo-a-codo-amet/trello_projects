/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f_mayoredad;

import java.util.Scanner;

public class F_MayorEdad {
static String nombre="";
static int edad =0;

    public static void main(String[] args) {
    carga();    
    String cadena =Mayor(edad);
        System.out.println(Mayor(edad));
        System.out.println(cadena);
        
    }
    
    static void carga(){
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
    nombre = teclado.next();
        System.out.println("Ingrese edad");
    edad = teclado.nextInt();
    
    }
    static String Mayor (int e){
        if (e>=18) {  
        return "Es mayor de edad";
            
        } else {
          return "Es menor de edad";
        }
   
    }

}
    
    

    

   
    
    
    
    

