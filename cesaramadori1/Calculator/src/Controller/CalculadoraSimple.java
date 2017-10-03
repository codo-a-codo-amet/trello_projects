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

    public double getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(double primerElemento) {
        this.primerElemento = primerElemento;
    }

    public double getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(double segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public double entregarElemento1() {
       return primerElemento;
    }

    @Override
    public double entregarElemento2() {
        return segundoElemento;
    }

    
   

}
