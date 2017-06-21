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
public class Numero_prf implements IAritmetica{
    private int unNumeroEntero;
    
    public Numero_prf(){
        unNumeroEntero = 1;
    }
    
    public Numero_prf(int valor){
        unNumeroEntero = valor;
    }
    
    ///////////////////////////////////////////////
    // 
    public void Sumar(IAritmetica aSumar){
        System.out.println("Sumando un entero");
    }
    
    public void Restar(IAritmetica aRestar){
        System.out.println("Restando un entero");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Multiplicando un entero");
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Dividiendo un entero");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Esto es un numero de valor" + unNumeroEntero;
    }
}
