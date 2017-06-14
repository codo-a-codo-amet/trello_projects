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
        System.out.println("La nueva silla modelo " + newHouse.getModelo() + " tiene color " + newHouse.color );
        System.out.println("Combina perfectamente con la mesa " + luis.forma + " que es de forma " + luis.tipo);
        
    }
    
}
