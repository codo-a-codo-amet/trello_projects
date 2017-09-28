/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

/**
 *
 * @author alumno
 */
public class CalculadoraSimple implements ICalculadora{

    @Override
    public float binaryOperation(float element1, String operation, float element2) {
        float result = 0.0f;
        
        if ( operation.equals("+")) {
            result = element1 +  element2;
        }
        if ( operation.equals("-")) {
            result = element1 -  element2;
        }
        if ( operation.equals("*")) {
            result = element1 *  element2;
        }
        if ( operation.equals("/")) {
            result = element1 /  element2;
        }
        
        return result;
    }
    
}
