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
//        Mueble unMueble = new Mueble();
//        System.out.println(unMueble.material);
//        
//        Silla unaSilla = new Silla();
//        System.out.println(unaSilla.dameTuMaterial());
//        System.out.println(unaSilla.dameTuColor());
//        
//        Laptop unaLaptop =  new Laptop("HP");
//        System.out.println(unaLaptop.dameTuMarca());
        System.out.println("-----------------------------------------------------");
        Aula unaAula = new Aula();
        System.out.println("Cantidad de sillas "+unaAula.dameCantidadSillas());
        System.out.println("Cantidad de mesas "+unaAula.dameCantidadMesas());
        System.out.println("Cantidad de alumnos "+unaAula.dameCantidadAlumnos());
        System.out.println("El Aula tiene capacidad "+unaAula.dameAulaLista());
        
        System.out.println("-----------------------------------------------------");
        Aula unaAula1 = new Aula();
        System.out.println("Cantidad de sillas "+unaAula1.dameCantidadSillas());
        System.out.println("Cantidad de mesas "+unaAula1.dameCantidadMesas());
        System.out.println("Cantidad de alumnos "+unaAula1.dameCantidadAlumnos());
        System.out.println("El Aula tiene capacidad "+unaAula1.dameAulaLista());

        System.out.println("-----------------------------------------------------");
        Aula unaAula2 = new Aula();
        System.out.println("Cantidad de sillas "+unaAula2.dameCantidadSillas());
        System.out.println("Cantidad de mesas "+unaAula2.dameCantidadMesas());
        System.out.println("Cantidad de alumnos "+unaAula2.dameCantidadAlumnos());
        System.out.println("El Aula tiene capacidad "+unaAula2.dameAulaLista());
        
        
        
        
    }
    
}
