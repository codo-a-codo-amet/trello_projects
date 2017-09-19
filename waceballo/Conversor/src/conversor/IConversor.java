/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.List;

/**
 *
 * @author wceba
 */
public interface IConversor {

    /**
     * Metodo para convetir unidaderatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la unidaderatura convertida
     * @return 
     */
    double Convertir(int opcion, Double valor);
    
    public List<String> getOpciones();
    
    
}
