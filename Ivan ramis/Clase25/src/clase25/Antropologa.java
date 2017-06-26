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
public class Antropologa implements IAritmetica<Integer>{
    private int unNumeroEntero;
    
    public Antropologa (int valor){
        this.unNumeroEntero = valor;
    }
    
    public void Sumar(IAritmetica<Integer> aSumar){
        this.unNumeroEntero = this.unNumeroEntero + aSumar.obtenerValor();
    }
    public void Restar(IAritmetica<Integer> aRestar){
        this.unNumeroEntero = this.unNumeroEntero - aRestar.obtenerValor();
    }
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
        this.unNumeroEntero = this.unNumeroEntero * aMultiplicar.obtenerValor();
    }
    public void Dividir(IAritmetica<Integer> aDividir){
        this.unNumeroEntero = this.unNumeroEntero / aDividir.obtenerValor();
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return unNumeroEntero == aObjeto.obtenerValor();
    }
    
    public String descripcion(){
        return "La cantidad de antropologos son " + unNumeroEntero;
    }
    
    public Integer obtenerValor (){
        return this.unNumeroEntero;
    }
}
