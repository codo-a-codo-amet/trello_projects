/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Clase29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nom = "";
        String ape = "";
        String user = "";
        String cor = "";
        String pas = "";
        String pas1 = "";
        Boolean confirmacion = Boolean.TRUE;

        PerfilUsuario usuario = new PerfilUsuario();
       
        System.out.println("Complete los campos requeridos para logearse");
        System.out.println("Ingrese su nombre:");
        nom = teclado.next();
        System.out.println("Ingrese su apellido:");
        ape = teclado.next();
        System.out.println("Ingrese su nombre de usuario:");
        user = teclado.next();

        while (confirmacion) {
            confirmacion = Boolean.FALSE;
            System.out.println("Ingrese su correo:");
            cor = teclado.next();
            if (!usuario.EsCorreoValido(cor)) {
                System.out.println("No es un Correo Valido");
                cor = teclado.next();
            }

            System.out.println("Ingrese su contraseña:");
            pas = teclado.next();

            if (!usuario.EsContraseniaValida(pas)) {
                System.out.println("La contraseña debe tener 8 o mas caracteres");
                pas = teclado.next();
            }

            System.out.println("Reingrese su contraseña:");
            pas1 = teclado.next();

            if (!pas.equals(pas1)) {
                System.out.println("Las contraseñas no son iguales");
                confirmacion = Boolean.TRUE;
            }else{
                usuario = new PerfilUsuario(user, pas, cor, nom, ape);
                System.out.println("Usuario registrado: "+usuario.getNombre_Usuario()+", correctamente");
            }

        }
        
    }
}
