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
    public void Sumar (IAritmetica aSumar);
    public void Restar (IAritmetica aRestar);
    public void Multiplicar (IAritmetica aMultiplicar);
    public void Dividir (IAritmetica aDividir);
    public boolean EsIgualA (IAritmetica Objeto);
    
    public String Descripcion ();
    
}
