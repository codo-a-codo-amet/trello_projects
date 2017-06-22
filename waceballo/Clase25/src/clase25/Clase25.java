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
//        Numero unNumero = new Numero(30);        
//        System.out.println(unNumero.descripcion()); // esto es un numero valor: aada
    
        IAritmetica algo = new Personas();       
        IAritmetica algo1 = new Personas(20);

        //prueba sumando
        algo.Sumar(algo1);
        System.out.println(algo.descripcion()); // esto es un numero valor: aada

        //prueba restando
        algo.Restar(algo1);
        System.out.println(algo1.descripcion()); // esto es un numero valor: aada

        //prueba multiplicando
        algo.Multiplicar(algo1);
        System.out.println(algo1.descripcion()); // esto es un numero valor: aada

        //prueba dividiendo
        algo.Dividir(algo1);
        System.out.println(algo1.descripcion()); // esto es un numero valor: aada

        //prueba de igualdad
        Boolean esigual = algo.EsIgualA(algo1);
        System.out.println("Es igual a: "+esigual); // esto es un numero valor: aada

        
    }
    
}
