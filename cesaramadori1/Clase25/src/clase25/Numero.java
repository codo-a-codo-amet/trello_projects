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
        System.out.println("Estoy sumando un entero de valor " + aSumar.obtenerValor()) ;
    }
    
    public void Restar(IAritmetica<Integer> aRestar){
        this.unNumeroEntero = this.unNumeroEntero - aRestar.obtenerValor();
        System.out.println("Estoy restando un entero de valor " + aRestar.obtenerValor());
    }
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
        this.unNumeroEntero = this.unNumeroEntero - aMultiplicar.obtenerValor();
        System.out.println("Estoy multiplicando un entero de valor " + aMultiplicar.obtenerValor());
    }
    public void Dividir(IAritmetica<Integer> aDividir){
        this.unNumeroEntero = this.unNumeroEntero - aDividir.obtenerValor();
        System.out.println("Estoy dividiendo un enterode valor " + aDividir.obtenerValor());
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return unNumeroEntero == aObjeto.obtenerValor();
    }
    
    public String descripcion(){
        return "Esto es un numero de valor " + unNumeroEntero;
    }
    
    public Integer obtenerValor(){
        return this.unNumeroEntero;
    }
}
