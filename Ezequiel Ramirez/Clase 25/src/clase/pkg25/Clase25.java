/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg25;

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
        
        
        IAritmetica primerObjetoAProbar = new IngenieroCivil();
        IAritmetica segundoObjetoAProbar = new IngenieroCivil();
        
        //Pruebas al objeto
        // Prueba de suma
        primerObjetoAProbar.Sumar(segundoObjetoAProbar);
        
        //prueba de Resta
        primerObjetoAProbar.Restar(segundoObjetoAProbar);        
        //prueba de Multiplicacion
        primerObjetoAProbar.Multiplicar(segundoObjetoAProbar);        
        //prueba de division
        primerObjetoAProbar.Dividir(segundoObjetoAProbar);        
        //prueba de igualdad
        Boolean esIgual = primerObjetoAProbar.EsIgualA(segundoObjetoAProbar);
        System.out.println("Es igual: " + esIgual);
        
      
        
        
        
        
    }
    
}
