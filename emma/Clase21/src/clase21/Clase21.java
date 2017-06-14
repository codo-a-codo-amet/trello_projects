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
        
        System.out.println(unVehiculo.Frenar());
            
        System.out.println(unVehiculo.dameTuMarca());
        System.out.println(unVehiculo.dameTuModelo());
        System.out.println(unVehiculo.dameTuAño());
        
         Vehiculo unaMoto = new Moto();
         System.out.println(unaMoto.dameTuPatente());
         
         Vehiculo nuevaPatente = new Moto("z56 6xyz");
         System.out.println(nuevaPatente.dameTuPatente());
         
    }
    
}
