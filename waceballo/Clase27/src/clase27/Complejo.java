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
    List<String> nombre;
    protected String localidad;
    
    Peliculas pelicula;
    
    
    public Complejo() {
        nombre = new ArrayList<>();
        nombre.add("Abasto");
        nombre.add("Dot");
        
        pelicula = new Peliculas();

        
    }

    public String dameComplejo(int valor){
        return "Complejo "+nombre.get(valor);
    }
    
    public String damePelicula(int valor){
        return "Pelicula "+pelicula.nombrePelicula.get(valor)+" genero "+pelicula.generoPelicula;
    }
    
    public String damePeliculaSala(int valor){
        return "Sala "+pelicula.sala.cantidadSalas.get(valor);
    }
    
    public String damePeliculaHorario(int valor){
        return "Horario "+pelicula.hora.hora.get(valor);
    }
    
    
    
}
