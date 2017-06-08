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
public class Moto extends Vehiculo {
    
    public Moto(){
        pasajeros = 1;
        ruedas = 2;
        marca = "BMW";
        modelo = "BMW Classic";
        patente = "ZZZ 001";
    }
    
    public Integer obtenerPasajeros(){
        return pasajeros;
    }
   public Integer obtenerRuedas(){
       return ruedas;
   }
   public String obtenerMotor(){
       return tipoMotor;
   }
    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo(){
        return modelo;
    }
    
    public String obtenerPatente(){
        return patente;
                
    }
    
}
