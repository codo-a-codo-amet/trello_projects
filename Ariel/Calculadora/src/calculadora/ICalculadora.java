/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public interface ICalculadora {
    
    public String getOperaciones(String valorA, String valorB, String signo);
    public String getSignoUsado(String boton,String valorA,String valorB,String signo);
    
    
}
