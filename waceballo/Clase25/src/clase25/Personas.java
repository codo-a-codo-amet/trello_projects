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
        cantidad = 1;   
    }
        
    public Personas(int valor){
        cantidad = valor;
    }
   
    public void Sumar(IAritmetica aSumar){
        System.out.println("Estoy sumando");
    }
    
    public void Restar(IAritmetica aRestar){
        System.out.println("Estoy restando");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Estoy multiplicando");
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Estoy dividiendo");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Un mensaje " + cantidad;
    }        

    
    public Integer obtenerValor() {
        return this.cantidad;
    }
                
    

    
}