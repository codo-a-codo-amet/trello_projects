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
public class Clase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo unVehiculo = new Vehiculo();
        
        System.out.println(unVehiculo.Avanzar());
        System.out.println(unVehiculo.Frenar());
        
        Moto unaPatente = new Moto("nkk 666");
        
        System.out.println(unaPatente.PasameTuPatente());
        
        Moto MiPatente = new Moto("vvv999");
        
        
        System.out.println(MiPatente.PasameTuPatente());
        
        
        
        
        
        
        
    }
    
}
