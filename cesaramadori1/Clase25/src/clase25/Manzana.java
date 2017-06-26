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
public class Manzana implements IAritmetica<Integer>  {
    private int manzanas;
    
public Manzana (int manzanas){
    this.manzanas = manzanas;
}

public void Sumar(IAritmetica<Integer> aSumar){
    this.manzanas = this.manzanas + aSumar.obtenerValor();
    System.out.println("Estoy sumando manzanas");
}
    public void Restar(IAritmetica<Integer> aRestar){
    System.out.println("Estoy restando manzanas");
}
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
    System.out.println("Estoy multiplicando manzanas");
    }
    public void Dividir(IAritmetica<Integer> aDividir){
    System.out.println("Estoy dividiendo manzanas");
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return this.manzanas == aObjeto.obtenerValor();
    }
    
    public String descripcion(){
        return "Esta es una manzana";
    }
    
    public Integer obtenerValor (){
        return this.manzanas;
    }
}
