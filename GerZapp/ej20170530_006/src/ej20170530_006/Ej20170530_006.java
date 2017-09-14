/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20170530_006;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej20170530_006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingresar Edad");
        edad = entrada.nextInt();
        
        System.out.println("Resultado de la funcion es: " + MayorMenor(edad));
        

    }
    public static String MayorMenor (int edad){
        if (edad >= 18){
            return  "Mayor";
        } else {
            return  "Menor";
        } 
    }
}
