/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.List;

/**
 *
 * @author wceba
 */
public interface ICalculadora {
    
    public Double Operaciones(Double num1, Double num2, String signo);
    
    public List<String> getOpciones();
    
    
}
