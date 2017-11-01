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
        float resultado = 0.0f;
        System.out.println("llego "+num1+ " "+ funcion);
        if (funcion.equals("sen")) {
            resultado = (float) Math.sin(num1);
        }else if (funcion.equals("cos")){
            resultado = (float) Math.cos(num1);
        }else if (funcion.equals("tan")){
            resultado = (float) Math.tan(num1);
        }else if (funcion.equals("ln")){
            resultado = (float) Math.log(num1);
        }else if (funcion.equals("log")){
            resultado = (float) Math.log10(num1);
        }else if (funcion.equals("1/x")){
            resultado = (float) Math.log1p(num1);
        }

        return resultado;
    }



    
}
