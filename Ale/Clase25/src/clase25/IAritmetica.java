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
public interface IAritmetica {
    public void Sumar(IAritmetica toAdd);
    public void Restar(IAritmetica toAdd);
    public void Multiplicar(IAritmetica toAdd);
    public void Dividir(IAritmetica toAdd);
    public Boolean EsIgualA(IAritmetica toAdd);
    
    public String descripcion();
}
