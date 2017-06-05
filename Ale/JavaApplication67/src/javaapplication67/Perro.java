/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

/**
 *
 * @author alumno
 */
public class Perro extends Mamifero implements ICuadrupedo { // Y cuadrupedo?
    private String nombre;
     
    public String trotar(){
        return "perro trotando";
    }
    
    public void ponerNombre(String nombreNuevo){
        nombre = nombreNuevo;
    }
    
    public String dameTuNombre(){
        return nombre;
    }
}
