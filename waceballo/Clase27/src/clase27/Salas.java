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
    Butacas listaButacas;

    public Salas() {
        listaButacas = new Butacas(10);
    }
        
    private int v;
    
    public Salas(int salas) {
        v = salas;
    }
    
    public List<Integer> getSalas(){
        cantidadSalas = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            cantidadSalas.add(i);
        }
        
        return cantidadSalas;
        
    }
    
    
    
    
}
