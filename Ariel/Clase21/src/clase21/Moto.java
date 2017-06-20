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
public class Moto extends Vehiculo implements IMoto {
    
        public int ruedas;
    public int pasajero;
    public String MarcaMoto;
    public String Color;
    public String Combustible;
    public boolean ArrancarMoto ;
    public String patente;
    
    public Moto(){
        ruedas = 2;
        MarcaMoto = "Motomel";
        pasajero = 2;
        Color = "Negro";
        combustible = "Nafta";
        ArrancarMoto = true; 
        
    }
    public String PasameTuPatente(){
        return patente;
    }
    
   
    
    public Moto (String NuevaPatente){
        patente = NuevaPatente;
        
    }
    
public String ArrancameLaMoto(){
    return "El auto arranco";
}
    
    
}
