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
        
        unVehiculo.setMarca("Ford");
        System.out.println(unVehiculo.getMarca());
        unVehiculo.Moverse(50);
        
        Moto unaMoto = new Moto();
        unaMoto.setPasajeros(1);
        System.out.println(unaMoto.getPasajeros());
        unaMoto.setTipoMotor("2 Cilindros");
        System.out.println(unaMoto.getTipoMotor());
        unaMoto.setPatente("ABC123");
        System.out.println(unaMoto.getPatente());
        unaMoto.setMarca("Honda");
        System.out.println(unaMoto.getMarca());
        unaMoto.Moverse(10);
    }
    
}
