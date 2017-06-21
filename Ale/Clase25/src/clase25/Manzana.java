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
public class Manzana implements IAritmetica  {
    private int manzanas;
    
public Manzana (int manzanas){
    this.manzanas = manzanas;
}

public void Sumar(IAritmetica aSumar){
    System.out.println("Estoy sumando manzanas");
}
    public void Restar(IAritmetica aRestar){
    System.out.println("Estoy restando manzanas");
}
    public void Multiplicar(IAritmetica aMultiplicar){
    System.out.println("Estoy multiplicando manzanas");
    }
    public void Dividir(IAritmetica aDividir){
    System.out.println("Estoy dividiendo manzanas");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return true;
    }
    
    public String descripcion(){
        return "Esta es una manzana";
    }
    
}
