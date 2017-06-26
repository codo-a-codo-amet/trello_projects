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
public class Numero implements IAritmetica<Integer>{
    private int unNumeroEntero;
    
    public Numero (int valor){
        this.unNumeroEntero = valor;
    }
    
    public void Sumar(IAritmetica<Integer> aSumar){
       this.unNumeroEntero = this.unNumeroEntero + aSumar.obtenerValor();
               
    }
    
    public void Restar(IAritmetica<Integer> aRestar){
        this.unNumeroEntero = this.unNumeroEntero - aRestar.obtenerValor();   
    }
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
        System.out.println("Estoy multiplicando un entero");
    }
    public void Dividir(IAritmetica<Integer> aDividir){
        System.out.println("Estoy dividiendo un entero");
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return unNumeroEntero ==;
    }
    
    public String descripcion(){
        return "Esto es un numero de valor" + unNumeroEntero;
    }
    
    public Integer obtenerValor(){
        return this.unNumeroEntero;
    }
}
