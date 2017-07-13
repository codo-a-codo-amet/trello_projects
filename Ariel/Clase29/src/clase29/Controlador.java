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
public class Controlador {
    
    protected IView unaVista;
    
    protected UserProfile profile;

    public Controlador(IView unaVista) {
        this.unaVista = unaVista;
    }

    public void run(){
        String nombre = "";
        String apellido = "";
        String nombre_usuario = "";
        String password = "";
        String email = "";
        

        Scanner aScanner = new Scanner(System.in);
        Boolean registraion_complete = Boolean.FALSE;
        
        //registraion_complete != Boolean.TRUE
        do {
            unaVista.Draw("Ingrese Nombre de Usuario");
            nombre_usuario = aScanner.next();

            unaVista.Draw("Ingrese email");
            email = aScanner.next();
            // confirmar si es un email
            if (email.indexOf("@") == -1) {
                unaVista.Draw("Error debe ingresar email valido");
                continue;
            }

            unaVista.Draw("Ingrese Contraseña");
            password = aScanner.next();

            if (password.length() < 8) {
                unaVista.Draw("Error debe ingresar una contraseña mayor a 8");
                continue;
            }

            unaVista.Draw("Ingrese Confirmacion de Contraseña");
            String confirm_password = aScanner.next();

            // Confirmar si password y confirm_password son iguales Y ademas
            // su longitud es mayor a 8 caracteres
            
            if ( password.compareTo(confirm_password) == 0) {
                registraion_complete = Boolean.TRUE;
                profile = new UserProfile(email, password, nombre_usuario, nombre, apellido);
            } else {
                unaVista.Draw("Error contraseña y confirmacion incorrectas");
            }
        }while (!registraion_complete) ;
    }

    /// Termino el registro de usuario magicamente tenemos el objeto profile
    // con la informacion del usuairo
    
}
