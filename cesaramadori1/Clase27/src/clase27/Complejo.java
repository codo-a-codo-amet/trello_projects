/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Complejo {
    protected String nombre;
    protected String direccion;
    List <Sala> salas ;
    
    public Complejo(){
        nombre = "Hoyts Unicenter";
        direccion = "Paraná 3475 Unicenter Shopping";
        salas = new ArrayList();
        for (int i = 0; i < 10; i++) {
            salas.add(new Sala("Sala "+i));
        }
        
    }
}
