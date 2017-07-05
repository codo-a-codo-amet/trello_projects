/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocine;

import java.util.*;

/**
 *
 * @author walter
 */
public class Complejo implements IComplejo{
  
    private List<Pelicula> listaPeliculas;
    private String nombreComplejo;
    
    public Complejo(){
        nombreComplejo = "Hoyts Abasto";
        
        listaPeliculas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            listaPeliculas.add(new Pelicula());
        }
        
    }
    
    @Override
    public String getComplejoNombre() {
        return nombreComplejo;
    }

    @Override
    public List<Pelicula> getListaDePeliculas() {
        return listaPeliculas;

    }

    @Override
    public List<Sala> getListaDeSalas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Butaca> getListaButacasLibres(Sala paraEstaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
