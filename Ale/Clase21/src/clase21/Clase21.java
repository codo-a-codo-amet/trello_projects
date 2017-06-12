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
        Moto motito = new Moto();
        motito.setAño(2016);
        motito.setModelo("Ninja");
        motito.setMarca("Kawasaki");
        motito.setCombustible("Gasolina");
        motito.setRuedas(2);
        motito.Arrancar();
        motito.setPasajeros(2);
        System.out.println("La"+" "+motito.getMarca()+" modelo "+motito.getModelo()+" es del año "+ motito.getAño());
        Lancha lanchita = new Lancha();
        System.out.println(unVehiculo.getMarca()+" "+unVehiculo.getModelo()+" "+unVehiculo.getAño()+" Esta detenido?"+ unVehiculo.Frenar());
        
        
        //System.out.println(mibici.getClass().getName().toString());
        
        System.out.println("Tengo una Bicicleta"+" marca "+mibici.marca+" del año "+mibici.anio);
    }
    
    
}
