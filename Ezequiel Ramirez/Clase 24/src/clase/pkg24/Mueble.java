/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg24;

/**
 *
 * @author alumno
 */
public class Mueble  {
    protected String material;
    protected String tipo;
    protected String tamaño;
    protected String color;
    protected String forma;
    
    public Mueble(){
        material = "Cuero";
        tipo = "Living";
        tamaño = "XL";
        color = "Marron";
        forma = "Rectangular";
        
    }
    public String getMaterial(){
        return material;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getTamaño(){
        return tamaño;
    }
    public String getColor(){
        return color;
    }
    public String getForma(){
        return forma;
    }
}
