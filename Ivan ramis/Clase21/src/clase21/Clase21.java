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
        
        Vehiculo otroVehiculo = new Vehiculo("Peugeot");
        
        System.out.println(otroVehiculo.dameTuMarca());
        
        IVehiculo unAvion = new Avion(); // ahora este fiat
        
        System.out.println(unVehiculo.Frenar());
        
        System.out.println(unAvion.dameTuMarca());
        
        IVehiculo otroAvion = new Avion("Chevrolet", "Hidroavion"); // ahora este lo quiero chevrolet
        
        System.out.println(otroAvion.dameTuMarca());
        
        //System.out.println(otroAvion.dameTusAlas());
    }
    
}
