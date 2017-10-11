/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class CalculadoraSimple implements ICalculadora{
    
    protected String operation;
    protected ArrayList<Double> elements;

    public CalculadoraSimple() {
        operation = "";
        elements = new ArrayList<>(2);
        Double doubleDefault = 0.0;
        elements.add(doubleDefault);
        elements.add(doubleDefault);
    }
    
    
    @Override
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public void setElement(int position, float element) {
        Double elementoDouble = new Double(element);
        elements.set(position, elementoDouble);
    }

    @Override
    public float executeBinaryOpertion() {
     float result = 0.0f;
        
        if ( operation.equals("+")) {
            result = elements.get(0).floatValue() + elements.get(1).floatValue();
        }
        
        return result;
    }

    @Override
    public String getOperation() {
        return operation;
     }

    @Override
    public float getElement(int position) {
        return elements.get(position).floatValue();
     }
    
}
