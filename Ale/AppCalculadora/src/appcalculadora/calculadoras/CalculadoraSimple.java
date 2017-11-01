/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author alumno
 */
public class CalculadoraSimple implements ICalculadora{
    
    protected String operation;
    protected TreeNode<String> elements;

    public CalculadoraSimple() {
        operation = "";
        elements = new TreeNode<>("Resultado");
    }
    
    
    @Override
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public void setElement(int position, float element) {
        Double elementoDouble = new Double(element);
      //  elements.set(position, elementoDouble);
    }

    @Override
    public float executeBinaryOpertion() {
     float result = 0.0f;
        
        if ( operation.equals("+")) {
            result = 0.0f;//elements.get(0).floatValue() + elements.get(1).floatValue();
        }
        
        return result;
    }

    @Override
    public String getOperation() {
        return operation;
     }

    @Override
    public float getElement(int position) {
        return Float.parseFloat(elements.iterator().next().toString());
     }

    @Override
    public float executeUnaryOperation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
