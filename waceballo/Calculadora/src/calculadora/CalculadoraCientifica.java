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
public class CalculadoraCientifica extends CalculadoraSimple{

    @Override
    public float Operacion(float num1, String funcion) {
        Double resultado = 0.00;
        
        if (funcion.equals("tan")) {
            resultado = Math.tan(num1);
        }

        return Float.parseFloat(resultado.toString());
    }



    
}
