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

    List<Integer> cantidadSalas;
    Butacas butaca;
    
    public Salas() {
        cantidadSalas = new ArrayList<>();
        cantidadSalas.add(1);
        cantidadSalas.add(2);
        cantidadSalas.add(3);
    }
    
    public int dameButacasDisponibles(){
        return butaca.dameButacasDisponibles();
    }
    
    
    
    
}
