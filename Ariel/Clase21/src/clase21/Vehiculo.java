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
    protected String tipoMotor;
    protected String combustible;
    protected String marca;
    protected String modelo;
    protected Integer año;
    protected String patente;
    
    
    public boolean ArrancarAuto;
    public boolean Avanzar;
     
    
    public Vehiculo(){
      ArrancarAuto = false;
      Avanzar = false;
    }
    
     public boolean Arrancar(){
       
         
     
         return ArrancarAuto;
        
    }
    
    public String Avanzar(){
        
    
        if (Arrancar() == true){
            Avanzar = true;
       return "el auto esta avanzando" ;
       
       } else {
            ArrancarAuto = true;
            return "No se puede avanzar porque el auto esta apagado, se procedera al arranque";
            
            
        }
    
    }
    public String Frenar(){
        if (Arrancar() == true){
            if (Avanzar = true){
             return "Se ha frenado el vehiculo";   
            }
            else{
                return "No se puede frenar porque el auto no esta en movimiento";
            }
          
            
            
        }
        else{
            ArrancarAuto = true;
        return "No se puede frenar el vehiculo porque nunca arranco";
        
    }
    }
            
}
