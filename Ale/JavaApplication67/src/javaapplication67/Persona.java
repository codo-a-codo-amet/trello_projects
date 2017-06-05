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
public class Persona implements IPersona{
    private String nombre;
    private String apellido;
    private Integer dni;
    public String sexo;
    public Ropa calzado;
    public Ropa pantalones;
    public Ropa sombrero;
    
    protected String religion;
    
    public String comoTeLlamas() {
        return nombre;
    }
   
}
