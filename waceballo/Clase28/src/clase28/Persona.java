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
    private String nombre;
    private String apellido;
    private int edad;
    private Integer dni;
    private String sexo;
    
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String toString(){
        return "Nombre: "+nombre+", Apellido: "+apellido;
    }
    
    
    public Persona (){
        nombre ="N";
        apellido="N";
        edad=0;
        dni =0;
        sexo="Indefinido";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    
}
