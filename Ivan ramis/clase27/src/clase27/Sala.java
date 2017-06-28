/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;
import java.util.*;
/**
 *
 * @author ivanr
 */
public class Sala {
    
    protected Integer numero;
    protected Integer cantButacas;
    protected Integer pelicula;
    
    List<Butaca> butacas;
     Pelicula peliculas;
       
    
 public Sala (){
     
    peliculas = new Pelicula();
    
    butacas = new ArrayList<>();
    
     for (int i = 0; i < 30; i++) {
         butacas.add(new Butaca());
     }
    
 }
 
 public String NombrePelicula(){
        return peliculas.GetNombre();
    }
 public Integer CantButacas(){
     return cantButacas;
 }
}
