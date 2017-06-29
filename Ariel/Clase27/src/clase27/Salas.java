/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Salas{
    
          protected Peliculas unaPelicula;
          List<Peliculas>Peliculass;
          List<Butacas> lista_de_butacas;
    public Salas (){
        lista_de_butacas = new ArrayList<>();
        lista_de_butacas.add(new Butacas());
        for (int f = 0; f < 50;f++){
            lista_de_butacas.add(new Butacas());
        }
        
   
    }
    
      public String GetComplejoNombre(){
        return "Hoyts Salta";
    }
    
    public List<Peliculas> getListaDePeliculas(){
        return null;
    }
    
    public List<Salas> getListaDeSalas(){
        return null;
    }
    
    public List<Butacas> getListaDeButacas(){
        return null;
    }
    
    
}
