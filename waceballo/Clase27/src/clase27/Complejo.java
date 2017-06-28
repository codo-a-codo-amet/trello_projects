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
    List<String> nombres;
    
    Peliculas pelicula = new Peliculas(10);
    Salas sala = new Salas(5);
    Butacas butaca = new Butacas(20);
    
    public Complejo() {
        
    }
    
    private int v;
    
    public Complejo(int complejo) {
        v = complejo;
    }
    
    public List<String> getComplejos(){
        nombres = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            nombres.add("Complejo "+i);
        }
        
        return nombres;
        
    }
    
    public String getPelicula(int valor){
        return pelicula.getPeliculas().get(valor);
    }
    
    public Integer getSalas(int valor){
        return sala.getSalas().get(valor);
    }
    
    public Integer getButacas(int valor){
        return butaca.getButacas().get(valor);
    }
    
    
    
}
