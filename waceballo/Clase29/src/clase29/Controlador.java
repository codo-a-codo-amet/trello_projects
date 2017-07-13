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
public class Controlador {

    protected VistaConsola unaVista;
    protected VistaDialogo unaVistaDialogo;
    protected PerfilUsuario usuario;
   
    public Controlador(VistaConsola unaVistaConsola) {
        this.unaVista = unaVista;
    }
        
    public void run() {
        Scanner teclado = new Scanner(System.in);
        String nom = "";
        String ape = "";
        String user = "";
        String cor = "";
        String pas = "";
        String pas1 = "";
        Boolean confirmacion = Boolean.TRUE;

        unaVista.Draw("Complete los campos requeridos para logearse");
        unaVista.Draw("Ingrese su nombre:");
        nom = teclado.next();
        unaVista.Draw("Ingrese su apellido:");
        ape = teclado.next();
        unaVista.Draw("Ingrese su nombre de usuario:");
        user = teclado.next();

        while (confirmacion) {
            confirmacion = Boolean.FALSE;
            unaVista.Draw("Ingrese su correo:");
            cor = teclado.next();
            if (!EsCorreoValido(cor)) {
                unaVista.Draw("No es un Correo Valido");
                cor = teclado.next();
            }

            unaVista.Draw("Ingrese su contraseña:");
            pas = teclado.next();

            if (!EsContraseniaValida(pas)) {
                unaVista.Draw("La contraseña debe tener 8 o mas caracteres");
                pas = teclado.next();
            }

            unaVista.Draw("Reingrese su contraseña:");
            pas1 = teclado.next();

            if (!pas.equals(pas1)) {
                unaVista.Draw("Las contraseñas no son iguales");
                confirmacion = Boolean.TRUE;
            } else {
                usuario = new PerfilUsuario(user, pas, cor, nom, ape);
                unaVista.Draw("Usuario registrado: " + usuario.getNombre_Usuario() + ", correctamente.");
            }

        }

    }


        public Boolean EsCorreoValido(String correo) {
        Boolean EsValido = Boolean.FALSE;

        if (correo.contains("@")) {
            EsValido = Boolean.TRUE;
            
        }
        
        return EsValido;
    }

    public Boolean EsContraseniaValida(String contra) {
        Boolean EsValido = Boolean.FALSE;

        if (contra.length() >= 8) {
            EsValido = Boolean.TRUE;
        }

        return EsValido;
    }



    
    
}
