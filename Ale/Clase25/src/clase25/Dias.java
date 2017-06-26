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
<<<<<<< HEAD
public class Dias implements IAritmetica {

    public void Sumar(IAritmetica toAdd){
=======
public class Dias implements IAritmetica<String> {
    
    public void Sumar(IAritmetica<String> toAdd){
>>>>>>> 17e18365ee98d37f58996da0e1aecb5affa8ec2b
        System.out.println("Sumando días");
    }
    public void Restar(IAritmetica<String> toAdd){
        System.out.println("Restando días");
    }
    public void Multiplicar(IAritmetica<String> toAdd){
        System.out.println("Multiplicando días");
    }
    public void Dividir(IAritmetica<String> toAdd){
        System.out.println("Dividiendo días");
    }
    public Boolean EsIgualA(IAritmetica toAdd){
        return false;
    }
    
<<<<<<< HEAD
}

=======

    public String obtenerValor(){
        return "";
    }
>>>>>>> 17e18365ee98d37f58996da0e1aecb5affa8ec2b
   
    public String descripcion() {
        return "Dias Enteros"; //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    
    
}
