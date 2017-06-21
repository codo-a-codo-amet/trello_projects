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
public class Persona  implements IAritmetica{
    private String nombre;
    
    public Persona( String nombre){
        this.nombre = nombre;
    }
    
    public Persona (){
        
    }
    
    public void Sumar(IAritmetica aSumar){
        System.out.println("Estoy sumando una Persona con nombre" + nombre);
    }
    
    public void Restar(IAritmetica aRestar){
        System.out.println("Estoy restando una Persona con nombre" + nombre);
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Estoy multiplicando una Persona con nombre" + nombre);
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Estoy dividiendo una Persona con nombre" + nombre);
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Esto es una Persona con nombre" + nombre;
    }
}
