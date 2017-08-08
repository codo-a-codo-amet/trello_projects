/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Complejo {
    protected String nombre;
    protected String direccion;
    
    /**
     *
     */
    protected List<Sala> Salas;
    
    
    public Complejo(){
        Complejo unComplejo = new Complejo();
        
        Salas = new ArrayList<>();
            
        for (int i = 0; i<10; i++){
            Salas.add(new Sala());
        }
        
    }    

    boolean getComplejoNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
