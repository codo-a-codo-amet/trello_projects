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
    protected String tipo;
    protected int cantidad_alas;
    
    public Avion(){
        pasajeros=14;
        ruedas=3;
        tipoMotor="bimotor";
        combustible="kerosene";
        marca="Fiat";
        modelo="spacio";
        año =2014;
        patente="asa832rn";
        tipo = "hidroavion";
        cantidad_alas = 2;
    }    
    
    public Avion(String nuevaMarca, String nuevotipo){
        super(nuevaMarca); // Vehiculo(nuevaMarca)
        tipo = nuevotipo;
        pasajeros=14;
        ruedas=3;
        tipoMotor="bimotor";
        combustible="kerosene";
        modelo="spacio";
        año =2014;
        patente="asa832rn";
        cantidad_alas = 2;
    }
    
    public int dameTusAlas(){
        return cantidad_alas;
    }
}
