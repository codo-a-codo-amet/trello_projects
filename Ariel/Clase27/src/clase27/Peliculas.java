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
public class Peliculas extends Complejo{
    
    List<Peliculas>lista_de_peliculas;
    
    public Peliculas(){
        
        lista_de_peliculas = new ArrayList<>();
        
        for (int p = 0; p < 10; p ++){
            lista_de_peliculas.add(new Peliculas());
        }
        
    }
        
   
    
}
