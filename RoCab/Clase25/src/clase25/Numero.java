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
public abstract class Numero implements IAritmetica{

    /**
     *
     * @param aSumar
     */
    @Override
    public void Sumar(IAritmetica aSumar){
        
    }
    
    /**
     *
     * @param aRestar
     */
    @Override
    public void Restar(IAritmetica aRestar){
        
    }

    /**
     *
     * @param aMultiplicar
     */
    @Override

    
    public void Multiplicar(IAritmetica aMultiplicar){
        
    }

    /**
     *
     * @param aDividir
     */
    @Override
    public void Dividir(IAritmetica aDividir){
        
    }    @Override

    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Esto es un numero de valor" + unNumeroEntero;
    }
  
    
}
