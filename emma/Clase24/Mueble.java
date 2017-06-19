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
public class Mueble implements IMueble{
    protected String material;
    protected String tipo;
    protected String tamanio;
    protected String color;
    protected String forma;
    
    public Mueble(){
        material = "Placa";
        tipo = "Escritorio";
        tamanio = "Mediana";
        color = "Blanca";
        forma = "Rectangula";
    }
    
    public Mueble(String marca){
        
    }
    
    
    
    
    public String dameTuMaterial(){
        return material;
    }    
    
    public String dameTuTipo(){
        return tipo;
    }
    
    public String dameTuColor(){
        return color;
    }
    
    public String dameTuForma(){
        return forma;
    }
            
    public String dameTuTamanio(){
        return tamanio;
    }
    
    
}