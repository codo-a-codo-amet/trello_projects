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
public class Persona {
    public String nombre;
    public String apellido;
    public Integer dni;
    public String sexo;
    public Ropa calzado;
    public Ropa pantalones;
    public Ropa sombrero;
    
    protected String religion;
    
    public String dameTuNombre(){
        return nombre;
    }
}
