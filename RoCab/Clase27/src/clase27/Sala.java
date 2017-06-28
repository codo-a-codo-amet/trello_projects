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
public class Sala extends Complejo{
    protected String nombreSala;
    protected Pelicula unaPelicula;
    
    protected List<Butaca> lista_Butacas;
    
    
    public Sala(){
        unaPelicula = new Pelicula();
        
        lista_Butacas = new ArrayList<Butaca>();
            
        for (int i = 0; i<24; i++){
            Butaca.add(new Butaca());
        }
    }
}
