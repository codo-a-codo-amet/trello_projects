/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20170523_005;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej20170523_005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, num2;

        System.out.println("Ingresar Numero");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        System.out.println("Ingresar otro Numero");
        num2 = entrada.nextInt();
        
        System.out.println("La suma es:"+ suma(num, num2));
        
    }
    public static int suma(int num,int num2){
        int suma;
        suma = num + num2;
        return suma;
    }    
}
