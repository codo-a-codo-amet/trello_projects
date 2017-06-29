/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Clase27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        IComplejo Hoyts =new Complejo();
        System.out.println("El nombre del complejo es " + Hoyts.getComplejoNombre());
        for (Iterator<Sala> iterator = Hoyts.getListaDeSalas().iterator(); iterator.hasNext();) {
            Sala unaSala = iterator.next();
            System.out.println("En la "+ unaSala.nombre + " se proyecta " + unaSala.peli1.getNombre());
            System.out.println();
            for (Iterator<Butacas> iterator2 = Hoyts.getListaButacasLibres(unaSala).iterator(); iterator.hasNext();) {
            Butacas unaButaca = iterator2.next();
            System.out.println(unaButaca.getUbicacion());
        }
        
        
           
    
        
//        System.out.println("El nombre del complejo seleccionado es " + Hoyts.nombre);
//        System.out.println("La direccion es "+Hoyts.direccion );
//        System.out.println("Cantidad de Salas: "+ Hoyts.salas.size());
//        System.out.println("La cantidad de funciones son: " + Hoyts.salas.get(3).horarios.size());
//        System.out.println("El primer Horario de la pelicula es " + Hoyts.salas.get(3).horarios.get(0).getHorarioInicio()+ " hs.");
//        System.out.println("El horario de la ultima pelicula es " + Hoyts.salas.get(3).horarios.get(6).getHorarioInicio()+ " hs.");
//        System.out.println("En la " +Hoyts.salas.get(3).nombre + " se proyecta el film " + Hoyts.salas.get(3).peli1.getNombre() );
//        System.out.println("Tiene " + Hoyts.salas.get(3).asientos.size() +" butacas");
//        System.out.println("La butaca " + Hoyts.salas.get(3).asientos.get(34).getUbicacion()+ " no esta ocupada");
//        Hoyts.salas.get(3).asientos.get(34).setOcupada(true);
//        System.out.println("La butaca " + Hoyts.salas.get(3).asientos.get(34).getUbicacion()  + " ahora esta ocupada " + Hoyts.salas.get(3).asientos.get(34).isOcupada());
    }
    
}
