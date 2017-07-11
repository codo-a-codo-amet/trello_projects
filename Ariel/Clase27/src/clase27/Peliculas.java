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
public class Peliculas implements IComplejo{
    private String nombrePelicula;
    
    List<Peliculas>lista_de_peliculas;
    
    public Peliculas(){
        
      }
    
    public Peliculas (String nombreLaPeli){
        this.nombrePelicula=nombreLaPeli;
    }
    
    public String getNombrePeli(){
        return nombrePelicula;
    }
    public void setNombrePeli(String nombreLaPeli){
        this.nombrePelicula=nombreLaPeli;
    }

    @Override
    public String getComplejoNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Peliculas> getListaDePeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
