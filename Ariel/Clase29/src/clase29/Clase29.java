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
      
        LoginUsuario unUsuario = new LoginUsuario ();
        
        unUsuario.UsuarioValido();
          
         Controlador unControlador = new Controlador(new Vista());
        
        unControlador.run();
        
       
        
        
        
   
        
        
        
        
    }
    
}
