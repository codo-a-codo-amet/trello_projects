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
public class Antropologa implements IAritmetica{
    private int unNumeroEntero;
    
    public Antropologa (int valor){
        this.unNumeroEntero = valor;
    }
    
    public void Sumar(IAritmetica aSumar){
        System.out.println("Estoy sumando un antropologo");
    }
    public void Restar(IAritmetica aRestar){
        System.out.println("Estoy restando un antropologo");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Estoy multiplicando un antropologo");
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Estoy dividiendo un antropologo");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "La cantidad de antropologos son " + unNumeroEntero;
    }
}
