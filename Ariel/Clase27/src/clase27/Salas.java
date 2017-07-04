/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Salas{
    
          protected Peliculas unaPelicula;
          protected int numeroDeButacas;
          protected boolean butacaLibre;
          protected String filaButacas;
          String valorNumFilaButacas;
          List<Peliculas>Peliculass;
          List<Butacas> lista_de_butacas;
          
    public Salas (){
        butacaLibre = true;
        filaButacas  = "ABCDE";
        valorNumFilaButacas="";
        int numfilaButacas = filaButacas.length();
        numeroDeButacas = 50;
        lista_de_butacas = new ArrayList<>();
      
        for (int f = 0; f < numeroDeButacas;f++){
            
            lista_de_butacas.add(new Butacas());
        }
        
        System.out.println(lista_de_butacas);
    }
    
    public int NumeroListaButacas(){
        return lista_de_butacas.size();
    }
    
      public String GetComplejoNombre(){
        return "Hoyts Salta";
    }
    
    public List<Peliculas> getListaDePeliculas(){
        return null;
    }
    
    public List<Salas> getListaDeSalas(){
   
    }
    
    public List<Butacas> getListaDeButacas(){
        return null;
    }
    
    
}
