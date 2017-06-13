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
        Bicicleta mibici = new Bicicleta();
        Moto motito = new Moto("Kawasaki", "Ninja", 2016, "Gasolina", 2);
        motito.Arrancar();
        motito.setPasajeros(2);
        motito.patente ="APE494";
        System.out.println("La"+" "+motito.getMarca()+" modelo "+motito.getModelo()+" es del año "+ motito.getAnio());
        System.out.println("La patente de la moto es: "+motito.DamelaPatente());
        Lancha lanchita = new Lancha();
        System.out.println(unVehiculo.getMarca()+" "+unVehiculo.getModelo()+" "+unVehiculo.getAnio()+" Esta detenido?"+ unVehiculo.Frenar());
        
        
        //System.out.println(mibici.getClass().getName().toString());
        
        System.out.println("Tengo una Bicicleta"+" marca "+mibici.marca+" del año "+mibici.anio);
    }
    
    
}
