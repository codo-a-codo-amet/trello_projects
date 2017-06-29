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
    List<Salas> lista_salas;
    
    public Complejo() {
        lista_salas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            lista_salas.add(new Salas());
        }
    }

    
    
}
