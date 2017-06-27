/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Peliculas {
    
    
    List<String> nombrePelicula;
    protected String generoPelicula;
    
    Horarios hora;
    Salas sala;
    Butacas butacasSalas;
    
    public Peliculas() {
        nombrePelicula = new ArrayList<>();
        nombrePelicula.add("Mi Villano Favorito 3");
        nombrePelicula.add("La Momia");
        
        generoPelicula = "Infantil";
        
        sala = new Salas();
        sala.cantidadSalas.get(0);
        
        hora =  new Horarios();
        hora.hora.get(0);
        //butacasSalas.dameButacasDisponibles();
    }
    

    
    
}
