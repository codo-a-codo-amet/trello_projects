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
public class Numero_ger implements IAritmetica<Integer>{
    
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
