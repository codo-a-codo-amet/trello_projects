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
        Aula.cantidad_sillas = 20;
        Aula unAula = new Aula();
        
        Aula otraAula = new Aula();
        Aula otraMasAula = new Aula();
        Aula algunaOtraMasAula = new Aula();
        Aula aquellaAula = new Aula();
        
        System.out.println("Cantidad de Sillas" + unAula.dameCantidadDeSillas());
    }
    
}
