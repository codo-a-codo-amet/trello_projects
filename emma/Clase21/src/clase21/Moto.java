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
       
    public Moto () {
    
    pasajeros = 1;
    ruedas = 2;
    tipoMotor = "naftero";        
    combustible = "nafta";
    marca = "yamaha";
    modelo = "SZ RR";
    año = 2017;
    patente = "a12 3bcd";
    }
    
    public Moto(String nuevaPatente) {
    pasajeros = 1;
    ruedas = 2;
    tipoMotor = "naftero";        
    combustible = "nafta";
    marca = "yamaha";
    modelo = "SZ RR";
    año = 2017;
    patente = nuevaPatente;
    }
            
}