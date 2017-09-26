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
public class CalculadoraSimple implements ICalculator{

    protected double primerElemento;
    protected double segundoElemento;
    protected double resultado;
    protected String operador;

    private double Calcular(){
        if (operador==""){
            resultado=0;
        }
        if (operador=="+"){
            resultado= primerElemento + segundoElemento;
        }
        if (operador=="-"){
            resultado= primerElemento - segundoElemento;
        }
        if (operador=="*"){
            resultado= primerElemento * segundoElemento;
        }
        if (operador=="/"){
            resultado= primerElemento / segundoElemento;
        }
        
        
        
        return resultado;
    }
    @Override
    public void definirElemento1(double numero) {
        this.primerElemento= numero;
    }

    @Override
    public void definirElemento2(double numero) {
        this.segundoElemento = numero;
    }

    @Override
    public void definirOperacion(String operador) {
        this.operador= operador;
    }

    @Override
    public double entregarResultado() {
        
        resultado = Calcular();
        return resultado;
    }

    
   

}
