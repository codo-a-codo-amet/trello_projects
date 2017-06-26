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
public class Dias implements IAritmetica <Integer>{
    public int elNumeroEntero;
    
    public Dias (int Valor){
        this.elNumeroEntero = Valor;
    }
    
    public void Sumar(IAritmetica<Integer> aSumar){
        this.elNumeroEntero = this.elNumeroEntero + aSumar.obtenerValor();
    }
    public void Restar(IAritmetica <Integer> aRestar){
        this.elNumeroEntero = this.elNumeroEntero - aRestar.obtenerValor();
    }
    public void Multiplicar(IAritmetica <Integer> aMultiplicar){
        this.elNumeroEntero = this.elNumeroEntero * aMultiplicar.obtenerValor();
    }
    public void Dividir(IAritmetica <Integer> aDividir){
        System.out.println("Dividiendo días");
    }
    public Boolean EsIgualA(IAritmetica <Integer> aObjeto){
        return Boolean.TRUE;
    }
    


   
    public String descripcion() {
        return "Dias Enteros"; //To change body of generated methods, choose Tools | Templates.
    }
    public Integer obtenerValor(){
        return this.elNumeroEntero;
    }

  
    
    
    
    
}
