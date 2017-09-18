/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author wceba
 */
public class ConversorFactory {
    
    public static IConversor CrearConversor(String tipo){
        IConversor conversor = null;
        
        if (tipo.equalsIgnoreCase("temperatura")){
            conversor = new ConversorTemperatura();
        }else if (tipo.equalsIgnoreCase("Distancia")){
            conversor = new ConversorDistancia();
        }
        
        return conversor;
    }
    
}
