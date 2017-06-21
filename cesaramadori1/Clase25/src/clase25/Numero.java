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
public class Numero implements IAritmetica{
    private int unNumeroEntero;
    
    public Numero (int valor){
        this.unNumeroEntero = valor;
    }
    
    public void Sumar(IAritmetica aSumar){
        System.out.println("Estoy sumando un entero");
    }
    
    public void Restar(IAritmetica aRestar){
        System.out.println("Estoy restando un entero");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Estoy multiplicando un entero");
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Estoy dividiendo un entero");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Esto es un numero de valor" + unNumeroEntero;
    }
}
