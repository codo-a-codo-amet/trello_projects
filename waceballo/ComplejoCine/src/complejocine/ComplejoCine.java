/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocine;

/**
 *
 * @author walter
 */
public class ComplejoCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo cine = new Complejo();
        System.out.println(cine.getComplejoNombre());
        
        System.out.println(cine.getListaDePeliculas());
    }
    
}
