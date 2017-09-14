/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20170511_06;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej20170511_06 {
/*ejercicio para calcular el perimetro de un tiangulo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3, perimetro;
        System.out.println("ingrese lado 1");      
        lado1 = entrada.nextInt();
        
        System.out.println("ingrese lado 2");
        lado2 = entrada.nextInt();

        System.out.println("ingrese lado 2");
        lado3 = entrada.nextInt();

        perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro es:" + perimetro);
                
        
    }
    
}
