/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Complejo {
    private int sala ;
    private String pelicula;
    private int butaca;
    List<Salas> numSalas;
    List<Butacas> numButaca;
    
    public Complejo(){
        
        numSalas = new ArrayList<>();
        numSalas.add(new Salas());
        
        
        for (int i = 0; i < 100; i++){
         numSalas.add(new Salas());    
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
    
    
    
    
    
}
