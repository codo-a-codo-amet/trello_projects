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
public class Mueble {
    
   protected String Material;
   protected String tipo;
   protected String tamaño;
   protected String color;
   protected String Forma;


public Mueble(){
Material = "madera";
tipo = "cocina";
tamaño = "2metros";        
color = "gris";
Forma = "cuadrada";
    }

public String dameTuMaterial(){
        return Material;
       } 
    public String dameTucolor(){
          return color;
      }
 
public String dameTutipo(){
        return tipo;
} 
}