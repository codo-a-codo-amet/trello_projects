/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Aula {
   static int cantidad_sillas = 10;
   static int cantidad_Laptop = 10;
   static int cantidad_Mesas = 10;
   
  List<Silla> sillas;  
  List<Alumno> Alumnos; 
  List<Laptop> Laptops;
  List<Mesa> Mesas;
     
     
    private Profesor unProfesor;
    
   private int obtenerCantidadAlumnos(int min, int max ){
       return min + ((max - min)*(int)(Math.random ()*100))/100;
   }
            
    public Aula(){
        unProfesor = new Profesor ();
        
       sillas= new  ArrayList <Silla>();
       Alumnos= new  ArrayList <Alumno>();
       Laptops= new  ArrayList <Laptop>(); 
       Mesas= new  ArrayList <Mesa>(); 
       
    
        
      int cantidad_Alumnos = obtenerCantidadAlumnos (5,30);
       
        for ( int i = 0; i<cantidad_sillas; i++){
            sillas.add(new Silla());
        }
        for ( int i = 0; i<cantidad_Alumnos; i++){
            Alumnos.add(new Alumno());
        }
        for ( int i = 0; i<cantidad_Laptop; i++){
             Laptops.add(new Laptop());
        }
        for ( int i = 0; i<cantidad_Mesas; i++){
            Mesas.add(new Mesa());
    
        }
           
        
    }
    public int dameCantidadDeSillas(){
    return sillas.size();
    }
    public int dameCantidadDeAlumno(){
    return Alumnos.size();
    }
    public int dameCantidadDeLaptops(){
    return Laptops.size();
    }
    public int dameCantidadDeMesas(){
    return Mesas.size();
    }
      
}
