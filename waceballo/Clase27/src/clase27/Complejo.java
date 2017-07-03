/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Complejo implements IComplejo{
    List<String> nombres;
    protected String localidad;
    
    Peliculas pelicula;
    private int v;
    
    public Complejo() {
        pelicula = new Peliculas();
        
    }
    
    public Complejo(int complejo) {
        v = complejo;
    }
    
    public List<String> getComplejos(){
        nombres = new ArrayList<>();
        nombres.add("Abasto");
        nombres.add("Dot");
        nombres.add("Village");
        nombres.add("Cinemax");
        nombres.add("Avellaneda");
        
        return nombres;
        
    }
    
    public String getPelicula(int valor){
        return pelicula.getPeliculas().get(valor);
    }
    
    public Integer getSala(int valor){
        return pelicula.getSalas(valor);
    }

    @Override
    public String getComplejoNombre() {
        return getComplejos().get(v);
    }

    @Override
    public List<Peliculas> getListaDePeliculas() {
        List<Peliculas> listaPeliculas = new ArrayList<>();
        for (Iterator<Peliculas> iterator = listaPeliculas.iterator(); iterator.hasNext();) {
            Peliculas peli = iterator.next();
            
        }
        return listaPeliculas;
    }

    @Override
    public List<Salas> getListaDeSalas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
