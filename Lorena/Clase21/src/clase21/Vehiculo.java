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
    private Integer año;
    private String patente;
    
    public Vehiculo(){
        
    }
    public Integer getPasajeros () {
        return pasajeros;
    }
    public Integer getRuedas () {
        return ruedas;
    }
    public String getTipoMotor () {
        return tipoMotor;
    }    
    public String getCombustible () {
        return combustible;
    }
    public String getMarca () {
        return marca;
    }
    public String getModelo (){
        return modelo;
    }
    public Integer getAño () {
        return año;
    }
    public String getPatente (){
        return patente;
    }
    
        
    
    public boolean Frenar(){
        return true;
    }
            
}
