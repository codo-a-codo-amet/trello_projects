/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Clase24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula.cantidad_sillas = 20;
        Aula.cantidad_Laptop = 20;
        Aula.cantidad_Mesas = 20;
        
        Aula unAula = new Aula ();
        
        Aula primerAula = new Aula ();
    System.out.println("cantidad de Sillas "+unAula.dameCantidadDeSillas());
    System.out.println("cantidad de Alumno "+unAula.dameCantidadDeAlumno());
    System.out.println("cantidad de Laptop "+unAula.dameCantidadDeLaptops());
    System.out.println("cantidad de Mesa "+unAula.dameCantidadDeMesas());    
        
        
        Aula segundaAula = new Aula ();
    System.out.println("cantidad de Sillas "+segundaAula.dameCantidadDeSillas());
    System.out.println("cantidad de Alumno "+segundaAula.dameCantidadDeAlumno());
    System.out.println("cantidad de Laptop "+segundaAula.dameCantidadDeLaptops());
    System.out.println("cantidad de Mesa "+segundaAula.dameCantidadDeMesas());    
        
        
        Aula tercerAula = new Aula ();
    System.out.println("cantidad de Sillas "+tercerAula.dameCantidadDeSillas());
    System.out.println("cantidad de Alumno "+tercerAula.dameCantidadDeAlumno());
    System.out.println("cantidad de Laptop "+tercerAula.dameCantidadDeLaptops());
    System.out.println("cantidad de Mesa "+tercerAula.dameCantidadDeMesas());    
        
        Aula cuartaAula = new Aula ();
                
    System.out.println("cantidad de Sillas "+cuartaAula.dameCantidadDeSillas());
    System.out.println("cantidad de Alumno "+cuartaAula.dameCantidadDeAlumno());
    System.out.println("cantidad de Laptop "+cuartaAula.dameCantidadDeLaptops());
    System.out.println("cantidad de Mesa "+cuartaAula.dameCantidadDeMesas());
   }
    
}
