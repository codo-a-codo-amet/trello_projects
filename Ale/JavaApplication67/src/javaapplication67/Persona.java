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
    private int edad;
    private Integer dni;
    private String sexo;
    private Ropa calzado;
    private Ropa pantalones;
    private Ropa sombrero;
    
    protected String religion;
    
    public Persona(){
        nombre = "Sin nombre";
        apellido = "Sin appelido";
        edad = 18;
        calzado = new Ropa();
        calzado.color = "Negro";
        calzado.marca = "Niquei";
        calzado.talle = "40";
    }
    
    public void ahoraTeLlamas(String nuevoNombre) {
       nombre = nuevoNombre;
    }
    
    public int queEdadTenes(){
        return edad;
    }
    
    public String deQueColorEsTuRopa(){
        return "el panatlon es " +  pantalones.color + " y el sombrero es de color " + sombrero.color;
    }
    
    public String comoTeLlamas() {
         if ( queEdadTenes() < 18) {
             return "Ni loco te digo, chau!";
         } else {
             return nombre;
         }
    }
   
}
