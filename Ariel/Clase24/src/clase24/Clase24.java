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
        
        Aula unaSilla = new Aula ();
        
        System.out.println("La cantidad de sillas es: "+ unaSilla.DameCantidadDeSillas());
        
        Aula unaMesa = new Aula ();
        
        System.out.println("La cantidad de mesas es: "+ unaMesa.DameCanidadDeMesas());
        
    }
    
}
