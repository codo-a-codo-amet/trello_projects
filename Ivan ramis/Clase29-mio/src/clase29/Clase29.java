/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Clase29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "";
        String appelido = "";
        String nombre_usuario = "";
        String password = "";
        String email = "";
        Integer correcto = 0;
        
        Scanner aScanner = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre de Usuario");
        nombre_usuario = aScanner.next();
        
        System.out.println("Ingrese email");
        email = aScanner.next();
               
        System.out.println("Ingrese Contraseña");
        password = aScanner.next();
        
        System.out.println("Ingrese Confirmacion de Contraseña");
        String confirm_password = aScanner.next();
        
                       
    }
    
}
