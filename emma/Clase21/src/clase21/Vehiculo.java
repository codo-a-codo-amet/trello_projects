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
    
    public Vehiculo(){
        pasajeros = 3;
        ruedas = 4;
        tipoMotor = "naftero";        
        combustible = "nafta";
        marca = "fiat";
        modelo = "Fiesta";
        año = 2017;
        patente = "aa 999 bb";
    }
    
    public String dameTuMarca(){
        return marca;
       } 
    public String dameTuModelo(){
          return modelo;
      }
 
public Integer dameTuAño(){
        return año;
        
       } 
    public void Moverse (int km){
    System.out.println ("se mueve" );
}
    public boolean Frenar(){
        return true;
    }
    
    public boolean Arrancar (){
        return true;
    }
    public String dameTuPatente (){
        return patente;  
    }
            
}
