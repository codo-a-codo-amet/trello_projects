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
    
    public String dameTuMarca(){
        return marca;
    }
    
    public void AhoraTuMarcaEs(String nuevaMarca){
        marca = nuevaMarca;
    }
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String nuevaMarca) {
        marca = nuevaMarca;
    }
    
    public boolean Frenar(){
        return true;
    }
            
}
