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
public static class CalculatorFactory {

    public static ICalculator CrearCalculadora (String tipo){
        ICalculator calculator = null;
        
        if(tipo.equalsIgnoreCase("Simple")){
            calculator= new CalculadoraSimple();
        }else if (tipo.equalsIgnoreCase("Cientifica")){
            calculator = new CalculadoraCientifica();
            
        
        }
        return calculator;
    }
}
