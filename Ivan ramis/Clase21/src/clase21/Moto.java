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

    public Moto() {
       pasajeros=2;
    }
    
    public void Moverse(int km) {
        if (km > 0) {
            Arrancar();
            System.out.println("La moto tiene que avanzar " + km + " km");
        } else {
            Frenar();
            System.out.println("Esta detenida ...");
        }
    }

}
