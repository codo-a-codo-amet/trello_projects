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
public class CalculadoraSimple implements ICalculadora{

    private float operando1;
    private float operando2;
    private float resultado;
    private String operacion;

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    //constructor de la clase
    public CalculadoraSimple() {

    }

    @Override
    public float Operaciones(float num1, String signo, float num2) {

        if (signo.equalsIgnoreCase("+")) {
            setResultado(num1 + num2);
        } else if (signo.equalsIgnoreCase("-")) {
            setResultado(num1 - num2);
        } else if (signo.equalsIgnoreCase("*")) {
            setResultado(num1 * num2);
        } else if (signo.equalsIgnoreCase("/")) {
            setResultado(num1 / num2);
        } else if (signo.equalsIgnoreCase("%")) {
            setResultado(num1 * num2/100);
        } else {
            setResultado(0.0f);
        }

        return getResultado();
    }

    @Override
    public float Operacion(float num1, String funcion) {
        return 0.0f;
    }




   
}
