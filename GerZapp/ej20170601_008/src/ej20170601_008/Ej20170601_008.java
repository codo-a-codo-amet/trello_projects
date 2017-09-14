/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20170601_008;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej20170601_008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int dolares;
        double cotiza;
        System.out.println("cantidad de dolares a comprar?");
        dolares = entrada.nextInt();
        System.out.println("Ingrese el valor del dolar");
        cotiza = entrada.nextDouble();
        System.out.println("El equivalente en pesos es: " + conversionusd(dolares, cotiza));
        
    }
    public static double conversionusd (int dolares, double cotiza){
        double conversionusd;
        conversionusd = dolares * cotiza; 
        return conversionusd;
    }
}
