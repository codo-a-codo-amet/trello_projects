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
public class Salas {

    List<Peliculas> pelicula;
    
    public Salas() {
        for (int i = 0; i < 10; i++) {
            pelicula.add(new Peliculas());
        }
    }
    
}
