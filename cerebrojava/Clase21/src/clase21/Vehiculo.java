/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author alumno
 */
public class Vehiculo implements IVehiculo {
    
   protected Integer pasajeros;
   protected Integer ruedas;
    private String tipoMotor;
    private String combustible;
    private String marca;
    private String modelo;
    protected Integer año;
    protected String patente;
    
    public Vehiculo(){
        
    }
    
     public boolean avanzar(){
           return true; 
     }
    
     public boolean frenar (){
           return true;
     }
     
     public boolean arrancar (){
            return true;
     }
   
     
     public boolean apagar (){
            return true;
     }       
    
    public boolean Frenar(){
        return true;
    }
            
}
