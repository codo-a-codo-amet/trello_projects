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
    List<Salas> numSalas;
 
    
    public Complejo(){
        
        numSalas = new ArrayList<>();
        numSalas.add(new Salas());
        
        
        for (int i = 0; i < 10; i++){
         numSalas.add(new Salas());    
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
        return new ArrayList();
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
