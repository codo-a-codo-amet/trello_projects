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
public class Peliculas {
    
    
    List<String> nombrePeliculas;
    protected String generoPelicula;
    
    Horarios hora;
    Salas sala;
    Butacas butacasSalas;
    
    public Peliculas() {
       
        generoPelicula = "Infantil";
        
        sala = new Salas();
        sala.cantidadSalas.get(0);
        
        hora =  new Horarios();
        hora.hora.get(0);
        //butacasSalas.dameButacasDisponibles();
    }
    
    private int v;
    
    public Peliculas(int peli) {
        v = peli;
    }
    
    public List<String> getPeliculas(){
        nombrePeliculas = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            nombrePeliculas.add("Pelicula "+i);
        }
        
        return nombrePeliculas;
        
    }
    


    
}
