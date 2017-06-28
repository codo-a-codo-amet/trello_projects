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
        // TODO code application logic here
//        Complejo cine = new Complejo();
//        System.out.println(cine.dameComplejo(0)+" "+cine.damePelicula(0) +" "+cine.damePeliculaSala(0)+" "+cine.damePeliculaHorario(0));
//
//        Complejo cine1 = new Complejo();
//        System.out.println(cine1.dameComplejo(1)+" "+cine1.damePelicula(1) +" "+cine1.damePeliculaSala(1)+" "+cine1.damePeliculaHorario(3));
        
        Complejo cine = new Complejo(10);
        Peliculas peli = new Peliculas(10);
        System.out.println(cine.getComplejos().get(1)+" "+cine.getPelicula(0)+" sala "+cine.getSalas(3));

    
    
    
    }
    
}
