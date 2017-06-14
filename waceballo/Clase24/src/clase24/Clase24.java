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
        System.out.println(unMueble.material);
        
        Silla unaSilla = new Silla();
        System.out.println(unaSilla.dameTuMaterial());
        System.out.println(unaSilla.dameTuColor());
        
        Laptop unaLaptop =  new Laptop("HP");
        System.out.println(unaLaptop.dameTuMarca());
        
        
    }
    
}
