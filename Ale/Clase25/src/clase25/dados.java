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
public class dados implements IAritmetica{
    private int dados;
    
    public dados(){
        dados = 1;
    }
    
    public dados(int valor){
        dados = valor;
        valor = 12;
    }
    
    ///////////////////////////////////////////////
    public void Sumar(IAritmetica aSumar){
        System.out.println("Sumando un dados");
    }
    
    public void Restar(IAritmetica aRestar){
        System.out.println("Restando un dados");
    }
    public void Multiplicar(IAritmetica aMultiplicar){
        System.out.println("Multiplicando un dados");
    }
    public void Dividir(IAritmetica aDividir){
        System.out.println("Dividiendo un dados");
    }
    public Boolean EsIgualA(IAritmetica aObjeto){
        return Boolean.TRUE;
    }
    
    public String descripcion(){
        return "Estos son " + dados;
    }
}