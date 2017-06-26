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
public class Personas implements IAritmetica {

    public Personas() {
        
    }
    public void Sumar(IAritmetica aSumar){
    System.out.println("Estoy sumando Personas");
    }
    public void Restar(IAritmetica aRestar){
    System.out.println("Estoy restando Personas");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
    System.out.println("Estoy multiplicando Personas");
    }
    public void Dividir(IAritmetica aDividir){
    System.out.println("Estoy dividiendo Personas");
    }
    public boolean EsIgualA(IAritmetica aObjeto){
        return true;
    }
    
    public String descripcion(){
        return "Estas son personas";
    }
    
}
