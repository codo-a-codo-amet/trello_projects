/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

/**
 *
 * @author alumno
 */
public class Clase25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero unNumero = new Numero(10);
        Numero otroNumero = new Numero(11);
        
        System.out.println(unNumero.descripcion()); // esto es un numero valor: 100
    
        unNumero.Sumar(otroNumero);

        System.out.println(unNumero.descripcion()); // esto es un numero valor: 200
    }
    
}
