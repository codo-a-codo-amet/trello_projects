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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfilDeUsuario elusuario = new PerfilDeUsuario();
        System.out.println("Bienvenido al sistema de registro de usuario");
        System.out.println("\nIngrese su Nombre: ");
        elusuario.setNombre(sc.nextLine());
        System.out.println("\nIngrese su apellido");
        elusuario.setApellido(sc.nextLine());
        
    }
    
}
