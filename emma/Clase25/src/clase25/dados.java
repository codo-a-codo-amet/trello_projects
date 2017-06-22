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
public class dados implements IAritmetica<Integer>{
    private int dados;
    
    public dados(){
        dados = 1;
    }
    
    public dados(int valor){
        dados = valor;
        valor = 12;
    }
    
    ///////////////////////////////////////////////
    public void Sumar(IAritmetica<Integer> aSumar){
        System.out.println("Sumando un dados");
        this.dados = this.dados + aSumar.obtenerValor();
    }
    
    public void Restar(IAritmetica<Integer> aRestar){
        System.out.println("Restando un dados");
        this.dados = this.dados - aRestar.obtenerValor();
    }
    public void Multiplicar(IAritmetica<Integer> aMultiplicar){
        System.out.println("Multiplicando un dados");
        this.dados = this.dados * aMultiplicar.obtenerValor();
    }
    public void Dividir(IAritmetica<Integer> aDividir){
        System.out.println("Dividiendo un dados");
        this.dados = this.dados / aDividir.obtenerValor();
    }
    public Boolean EsIgualA(IAritmetica<Integer> aObjeto){
        return dados == aObjeto.obtenerValor();
    }
    
    public String descripcion(){
        return "Hay " + dados;
    }
    public Integer obtenerValor(){
        return this.dados;
    }

    }
    
    