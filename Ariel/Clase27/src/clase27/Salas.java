/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 *
 * @author alumno
 */
public class Salas{
    
         
          
          protected int numeroDeButacas = 11;
          protected boolean butacaLibre;
          protected String filaButaca;
          protected String [] filaButacas= new String[]{"A","B","C","D","E"};
          public int numfilaButacas;
          public String letraFila;
          int xx;
          int yy; 
          public String pelis;
          Peliculas laspelis;
          String valorNumFilaButacas;
          List<Peliculas>Peliculass;
          List<Butacas> lista_de_butacas;
          
    public Salas (String pelis){
        this.pelis = pelis;
        
        letraFila = "";
        butacaLibre = true;
        valorNumFilaButacas="";
        filaButaca = "ABCDE";
        numfilaButacas = filaButaca.length();
        
        lista_de_butacas = new ArrayList<>();
      
        for (int i = 0; i < numfilaButacas;i++){
            for (int j = 1; j < numeroDeButacas; j++)
            lista_de_butacas.add(new Butacas(filaButacas [i]+j));
        }
        
       
}
    public String toString(){
        return this.pelis+" ";
    }
    
    public String getPelis(){
        return pelis;
    }
    
    public void setPelis(String pelis){
        this.pelis = pelis;
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
   return null;
    }
    
    public List<Butacas> getListaDeButacas(){
        return null;
    }
    
    
}

