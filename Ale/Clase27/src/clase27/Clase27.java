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
        // TODO code application logic here    

        IComplejo hoytsAbasto = new Complejo();

        System.out.println(hoytsAbasto.getComplejoNombre());
        
        Iterator<Sala> iteratorSala = hoytsAbasto.getListaDeSalas().iterator();
        
        while (  iteratorSala.hasNext()) {
            Sala unaSala = iteratorSala.next();
            System.out.println("sala: " + unaSala);
            System.out.println(hoytsAbasto.getListaButacasLibres(unaSala));
        }
        

        /*
    public List<Pelicula> getListaDePeliculas();
    
    public List<Sala> getListaDeSalas();
    
    public List<Butaca> getListaButacasLibres(Sala paraEstaSala);
         */
        IComplejo hoytDot = new Complejo();

    }

}
