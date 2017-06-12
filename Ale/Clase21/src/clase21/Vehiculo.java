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
    
    private Integer pasajeros;
    private Integer ruedas;
    private String tipoMotor;
    private String combustible;
    private String marca;
    private String modelo;
    private Integer año;
    private String patente;
    
    public Vehiculo(){
        
    }
    
    public boolean Frenar(){
        return true;
    }
            
}
