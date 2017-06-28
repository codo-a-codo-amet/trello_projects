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
public class Salas {
      protected  Peliculas unaPeliculas;
      protected  List <Butacas> lista_de_Butacas;
    
    public Salas(){
  
        unaPeliculas = new Peliculas();
             
        lista_de_Butacas = new ArrayList<>();
        
        for (int i = 0;i <10;i++){
        lista_de_Butacas.add (new Butacas());
        
        
}
