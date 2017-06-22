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
public interface IAritmetica<t> {
    public void Sumar(IAritmetica<t> aSumar);
    public void Restar(IAritmetica<t> aRestar);
    public void Multiplicar(IAritmetica<t> aMultiplicar);
    public void Dividir(IAritmetica<t> aDividir);
    public Boolean EsIgualA(IAritmetica<t> aObjeto);
    
    public String descripcion();
    ///////////////////////////
    public t obtenerValor();
}
