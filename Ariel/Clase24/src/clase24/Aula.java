/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
import java.util.List;
public class Aula {
    private Profesor unProfesor;
    
    
    List<Silla> sillas;
    List<Mesa> mesas;
    List<Alumnos> alumnos;
    public int aleatorio;
    public int Aleatorio(int d, int h){
        return (int)(Math.random()*(h - d))+d;
     
    }
    
    public Aula(){
        
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        
        sillas.add(new Silla());
       for (int i = 0 ; i < 10; i++){
           sillas.add(new Silla());
       }
        
       mesas = new ArrayList<>();
        
       for (int j = 0 ; j < 10; j++){
           mesas.add(new Mesa());
       }

          
       alumnos = new ArrayList<>();
     
       aleatorio = Aleatorio (5, 30);
       for (int al = 0 ; al < aleatorio ; al++){
           alumnos.add(new Alumnos());
       }
       
     }
    public int DameCantidadDeSillas(){
        return sillas.size();
    }
    
    public int DameCanidadDeMesas(){
        return sillas.size();
    }
    public int DameCantidadAlumno(){
        return alumnos.size();
    }
    
}
