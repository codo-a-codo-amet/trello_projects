/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

/**
 *
 * @author alumno
 */
public class Clase24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mueble unMueble = new Mueble();
        Silla newHouse = new Silla();
        Mesa luis = new Mesa();
        Aula clase1 = new Aula();
        
        //System.out.println("La nueva silla modelo " + newHouse.getModelo() + " tiene color " + newHouse.color );
        //System.out.println("Combina perfectamente con la mesa " + luis.forma + " que es de forma " + luis.tipo);
        
        System.out.println("La cantidad de sillas en el aula es " + clase1.dameCantidadDeSillas());
        System.out.println("La cantidad de mesas en el aula es " + clase1.dameCantidadDeMesas());
        System.out.println("La cantidad de alumnos en el aula es " + clase1.dameCantidadDeAlumnos());
        System.out.println("Quedan "+ clase1.DameSillasLibres() +" sillas Libres");
        System.out.println("Nombre de los alumnos:");
        System.out.println(clase1.DameListaAlumnos().iterator().toString());
    }
    
}
