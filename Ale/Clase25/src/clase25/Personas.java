/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Personas implements IAritmetica<Integer>{
    
    private int cantidad;
    
    public Personas(){
        
    }
        
    public Personas(int valor){
        cantidad = valor;
    }
   
    public void Sumar(IAritmetica aSumar){
         cantidad += cantidad;
    }
    
    public void Restar(IAritmetica<Integer> aRestar){
        
    }
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
        
    }
    public void Dividir(IAritmetica<Integer> aDividir){
        
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Un mensaje " + cantidad;
    }        
                
    public Integer obtenerValor(){
        return cantidad;
    }

    
}