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
      
    }
     public Moto(String marca, String modelo, int anio, String combustible, int ruedas){
         this.marca = marca;
         this.modelo = modelo;
         this.anio = anio;
         this.combustible = combustible;
         this.ruedas = ruedas;
     }
     public String DamelaPatente (){
         return this.patente;
     }
     
}

