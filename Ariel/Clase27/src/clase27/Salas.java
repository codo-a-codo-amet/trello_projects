/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.List;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Iterator;
import java.util.StringTokenizer;
=======
>>>>>>> b07f0be704eb3662bc286df95e60a573877cd12e

/**
 *
 * @author alumno
 */
public class Salas{
    
<<<<<<< HEAD
         
          
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
=======
          protected Peliculas unaPelicula;
          List<Peliculas>Peliculass;
          List<Butacas> lista_de_butacas;
    public Salas (){
        lista_de_butacas = new ArrayList<>();
        lista_de_butacas.add(new Butacas());
        for (int f = 0; f < 50;f++){
            lista_de_butacas.add(new Butacas());
        }
        
   
>>>>>>> b07f0be704eb3662bc286df95e60a573877cd12e
    }
    
      public String GetComplejoNombre(){
        return "Hoyts Salta";
    }
    
    public List<Peliculas> getListaDePeliculas(){
        return null;
    }
    
    public List<Salas> getListaDeSalas(){
<<<<<<< HEAD
   return null;
=======
        return null;
>>>>>>> b07f0be704eb3662bc286df95e60a573877cd12e
    }
    
    public List<Butacas> getListaDeButacas(){
        return null;
    }
    
    
}

