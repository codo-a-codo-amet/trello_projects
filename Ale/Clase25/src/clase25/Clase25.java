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
        
<<<<<<< HEAD
        IAritmetica primerObjetoAProbar = new dados(2);
        IAritmetica segundoObjetoAProbar = new dados();
=======
        IAritmetica primerObjetoAProbar = new Antropologa(2);
        IAritmetica segundoObjetoAProbar = new Persona();
>>>>>>> 17e18365ee98d37f58996da0e1aecb5affa8ec2b
        
        //Pruebas al objeto
        // Prueba de suma
        primerObjetoAProbar.Sumar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de Resta
        primerObjetoAProbar.Restar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de Multiplicacion
        primerObjetoAProbar.Multiplicar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de division
        primerObjetoAProbar.Dividir(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de igualdad
        Boolean esIgual = primerObjetoAProbar.EsIgualA(segundoObjetoAProbar);
        System.out.println("Es igual: " + esIgual);
        
        
    }
    
}
