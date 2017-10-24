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
public class CalculadoraCientifica extends CalculadoraSimple{

    @Override
    public float executeUnaryOperation() {
        float result = 0.0f;
        if ( operation.equals("tan")){
            result = new Float(Math.tan(0));
        }
        return result; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
