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
public interface IAritmetica <Tipo>{
    public void Sumar(IAritmetica <Tipo> aSumar);
    public void Restar(IAritmetica <Tipo> aRestar);
    public void Multiplicar(IAritmetica <Tipo> aMultiplicar);
    public void Dividir(IAritmetica <Tipo> aDividir);
    public Boolean EsIgualA(IAritmetica <Tipo> aIgular);
    
    public String descripcion();
    ///////////////////////////
    
    public Tipo obtenerValor();



}
