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
public class Mesa extends Mueble{
    private String Material;
    private String Color;
    private String Tamaño;
    
    public Mesa(){
        Material = "";
        Color = "";
        Tamaño = "";
    }
    
    public String DameTuMaterial(){
        return Material;
        
    }
    
    public Mesa(String NuevoMaterial){
        Material = NuevoMaterial;
    }
    
    
}
