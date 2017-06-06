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
    public int edad;
    
    protected String religion;
    
    public Persona(){
        nombre = "Sin nombre";
        apellido = "Sin apellido";
       dni = 0;
       sexo = "Sin sexo";
       calzado.color = "Negro";
       calzado.marca = "Adidas";
       calzado.talle = "L";
       pantalones.color = "Azul";
       pantalones.marca = "Adidas";
       pantalones.talle = "L";
       sombrero.color = "Negro";
       sombrero.marca = "Nike";
       sombrero.talle = "No Aplica";
       edad = 0;
   
    }
    
    public String comoTeLlamas() {
        return nombre;
    }
      
    public String apellido(){
        return apellido;
    }
   private Integer dni(){
       return dni;
   }

}
