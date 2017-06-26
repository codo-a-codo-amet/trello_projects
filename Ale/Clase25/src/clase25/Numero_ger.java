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
public class Numero_ger implements IAritmetica{
=======
public class Numero_ger implements IAritmetica<Integer>{
    
>>>>>>> 17e18365ee98d37f58996da0e1aecb5affa8ec2b
        private int unNumeroEntero;
        
        public Numero_ger (int valor){
        unNumeroEntero = valor;
        }
            
    public void Sumar(IAritmetica<Integer> toAdd) {

    }

    public void Restar(IAritmetica<Integer> toAdd) {

    }

    public void Multiplicar(IAritmetica<Integer> toAdd) {

    }

    public void Dividir(IAritmetica<Integer> toAdd) {

    }

    public Boolean EsIgualA(IAritmetica<Integer> toAdd) {
           return Boolean.FALSE;
    }
    
    public String descripcion(){
        return "";
    }
    
    public Integer obtenerValor(){
        return unNumeroEntero;
    }
    
    
}
