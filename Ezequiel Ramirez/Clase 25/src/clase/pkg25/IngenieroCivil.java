/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg25;

/**
 *
 * @author alumno
 */

//Esta clase suma manzanas
public class IngenieroCivil implements IAritmetica{
    
   public void Sumar(IAritmetica aSumar){
    System.out.println("Estoy sumando Ingenieros Civiles");
    }
    public void Restar(IAritmetica aRestar){
    System.out.println("Estoy restando Ingenieros Civiles");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
    System.out.println("Estoy multiplicando Ingenieros Civiles");
    }
    public void Dividir(IAritmetica aDividir){
    System.out.println("Estoy dividiendo Ingenieros Civiles");
    }
    public boolean EsIgualA(IAritmetica aObjeto){
        return true;
    }
    
    public String descripcion(){
        return "Es un Ingeniero Civil";
    }
    }

    
    

