/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

/**
 *
 * @author alumno
 */
public class Clase27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Complejo Hoyts =new Complejo();
        System.out.println("El nombre del complejo seleccionado es " + Hoyts.nombre);
        System.out.println("La direccion es "+Hoyts.direccion );
        System.out.println("Cantidad de Salas: "+ Hoyts.salas.size());
        System.out.println("En la " +Hoyts.salas.get(3).nombre + " se proyecta el film " + Hoyts.salas.get(3).peli1.getNombre() );
        System.out.println("Tiene " + Hoyts.salas.get(3).asientos.size() +" butacas");
        System.out.println("La butaca " + Hoyts.salas.get(3).asientos.get(34).getUbicacion()+ " no esta ocupada");
        Hoyts.salas.get(3).asientos.get(34).setOcupada(true);
        System.out.println("La butaca " + Hoyts.salas.get(3).asientos.get(34).getUbicacion()  + " ahora esta ocupada " + Hoyts.salas.get(3).asientos.get(34).isOcupada());
    }
    
}
