/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author alumno
 */
public class Complejo implements IComplejo {
    private int sala ;

    private int butaca;
    private int cantidadSalas = 3;
    private String[] lasPeliculas= new String []{"'La era de hielo 5 3D '",
        "'Piratas del Caribe 9 Subtitulado'","'El día de la independencia 3D'"
    } ;
    List<Salas> numSalas;
    List<Butacas> numButaca;
    
    public Complejo(){
        
        numSalas = new ArrayList<>();
       
        
     
        for (int i = 0; i < cantidadSalas; i++){
         numSalas.add(new Salas("Sala "+(i+1)+" "+lasPeliculas[i]));    
        }
        
        numButaca = new ArrayList<>();
        numButaca.add(new Butacas());
        
         for (int j = 0; j < 10; j++){
         numButaca.add(new Butacas()); 
         }      
        }
         
    public int DameCantidadSalas (){
        
        return numSalas.size();
    }
    
    public String GetComplejoNombre(){
        return "Hoyts Salta";
    }
    
    @Override
    public List<Peliculas> getListaDePeliculas(){
        return null;
    }
    
    @Override
    public List<Salas> getListaDeSalas(){
        return numSalas;
    }
    
    public List<Butacas> getListaDeButacasLibres(Salas ParaEstaSala){
        return null;
    }

    @Override
    public String getComplejoNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
