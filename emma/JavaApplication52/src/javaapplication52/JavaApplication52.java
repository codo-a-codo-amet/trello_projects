/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingresar numero");
        int dia = entrada.nextInt ();
        if (dia == 1){
            System.out.println("Lunes");
        }
        else if (dia == 2){
            System.out.println("Martes");
        }
        else if (dia == 3){
            System.out.println("Miercoles");
        }
        else if (dia == 4){
            System.out.println("Jueves");
        }
        else if (dia == 5){
            System.out.println("Viernes");
        }
        else if (dia == 6){
            System.out.println("Sabado");
        }
        else if (dia == 7){
            System.out.println("Domingo");
        }
        else if (dia < 1 || dia > 7){
            System.out.println("Numero Invalido");
        }
    }
}
