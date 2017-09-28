/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this unidadlate file, choose Tools | Templates
 * and open the unidadlate in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class CalculadoraSimple implements ICalculadora {

    private Double operando1;
    private Double operando2;
    private Double resultado;
    private String operacion;

    public Double getOperando1() {
        return operando1;
    }

    public void setOperando1(Double operando1) {
        this.operando1 = operando1;
    }

    public Double getOperando2() {
        return operando2;
    }

    public void setOperando2(Double operando2) {
        this.operando2 = operando2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
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
        setOperando1(0.00);
        setOperando2(0.00);
        setResultado(0.00);
    }

    @Override
    public Double Operaciones(Double num1, String signo, Double num2) {
        setOperando1(num1);
        setOperando2(num2);
        setOperacion(signo);

        if (signo.equalsIgnoreCase("+")) {
            setResultado(num1 + num2);
        } else if (signo.equalsIgnoreCase("-")) {
            setResultado(num1 - num2);
        } else if (signo.equalsIgnoreCase("*")) {
            setResultado(num1 * num2);
        } else if (signo.equalsIgnoreCase("/")) {
            setResultado(num1 / num2);
        } else {
            setResultado(0.00);
        }

        return getResultado();
    }

}
