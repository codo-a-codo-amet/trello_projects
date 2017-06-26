/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

import java.util.*;

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
        
        List<Persona> lista_de_personas = new ArrayList();
        
        
        IAritmetica primerObjetoAProbar = new dados(2);
        IAritmetica segundoObjetoAProbar = new dados();
        
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
