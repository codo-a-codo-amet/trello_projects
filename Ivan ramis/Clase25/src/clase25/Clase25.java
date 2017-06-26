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
        Antropologa unNumero = new Antropologa(3);
        Antropologa otroNumero = new Antropologa(3);
        
        unNumero.Sumar(otroNumero);
        System.out.println(unNumero.descripcion());
        unNumero.Restar(otroNumero);
        System.out.println(unNumero.descripcion());
        unNumero.Multiplicar(otroNumero);
        System.out.println(unNumero.descripcion());        
        unNumero.Dividir(otroNumero);
        System.out.println(unNumero.descripcion());
        unNumero.EsIgualA(otroNumero);
        System.out.println(unNumero.descripcion());        
    }
    
}
