/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20170511_05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej20170511_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num = entrada.nextInt();
        for(int i = 1; i == num; i++){
            System.out.println(i);
        }
    }
    
}
