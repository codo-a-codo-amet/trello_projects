/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
interface ICalculator {
     public void definirElemento1(double numero);
     
     public void definirElemento2(double numero);
    
     public void definirOperacion(String operador);
     
     public double entregarResultado ();
}
