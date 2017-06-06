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
    private Integer edad;
    public String sexo;
    public Ropa calzado;
    public Ropa pantalones;
    public Ropa sombrero;
    
    protected String religion;
    
    public Persona(){
        nombre = "sin nombre";
        apellido = "sin apellido";
        dni = 36397441;
        edad = 10;
        sexo = "sin sexo";
        calzado = new Ropa();
        calzado.color = "negro";
        calzado.marca = "compaq";
        calzado.talle = "42";
        calzado.tipo = "zapatilla";
        pantalones = new Ropa();
        pantalones.color = "negro";
        pantalones.marca = "asus";
        pantalones.talle = "32";
        pantalones.tipo = "Pantalon corto";
        sombrero = new Ropa();
        sombrero.color = "marron";
        sombrero.marca = "MSI";
        sombrero.talle = "5";
        sombrero.tipo = "copa";
        
                
    }
    
    public void ahoraTeLlamas (String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public String comoTeLlamas() {
        if ( queEdadTenes () < 18){
            return "ni loco te digo";
         
        } else {
        return nombre;
        }
    } 
    
    
    public int queEdadTenes(){
        return edad;
    }
    public String deQueColorEsTuRopa(){
        return pantalones.color;
    }
   
}
