/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Personas {
    
    String Lista_Personas[];
    
    public Personas(String nombre){
        Lista_Personas = new String[10];
        
        for (int i = 0; i < 10; i++) {
            Lista_Personas[i]= nombre;
        }
        
                
                
    }
    

    
}
    