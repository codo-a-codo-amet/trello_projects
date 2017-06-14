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
public class Avion extends Vehiculo {
    protected Integer cantidad_alas;
    
    public Avion () {
    cantidad_alas = 2;
    pasajeros = 350;
    tipoMotor = "aeronautico";        
    combustible = "gas";
    marca = "Avro";
    modelo = "Boeing 747";
    año = 2017;
    }
    
    public Integer getAlas(){
        return cantidad_alas;
    }
}
    
