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
public class Dias implements IAritmetica {
    
    public void Sumar(IAritmetica toAdd){
        System.out.println("Sumando días");
    }
    public void Restar(IAritmetica toAdd){
        System.out.println("Restando días");
    }
    public void Multiplicar(IAritmetica toAdd){
        System.out.println("Multiplicando días");
    }
    public void Dividir(IAritmetica toAdd){
        System.out.println("Dividiendo días");
    }
    public Boolean EsIgualA(IAritmetica toAdd){
        return false;
    }
    


   
    public String descripcion() {
        return "Dias Enteros"; //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    
    
}
