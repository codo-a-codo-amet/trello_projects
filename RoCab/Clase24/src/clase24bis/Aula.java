/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24bis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Aula {
    
    List<Silla> sillas;
    List<Mesa> mesas;
    private Profesor unProfesor;
    
    public Aula(){
        
        unProfesor= new Profesor();
        
        sillas = new ArrayList<Silla>();
            
        for (int i = 0; i<24; i++){
            sillas.add(new Silla());
        }    
        mesas = new ArrayList<Mesa>();
        for (int i=0; i<7; i++){
            mesas.add(new Mesa());
    }
        public int dameCantidadDe Mesas(ArrayList<Mesa>){
        return mesas.size();
    }
        
}
