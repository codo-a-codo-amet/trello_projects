/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/**
 *
 * @author alumno
 */
public class Persona {

    protected String nombre;
      
    protected String apellido;
    
    private int edad;
    
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
    }
 
    public String toString(){
        return "Mi nombre es " + nombre + " y apellido: " + apellido;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    
}
