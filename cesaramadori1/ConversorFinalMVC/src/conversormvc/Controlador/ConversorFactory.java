/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorFactory {

    public static IConversor CrearConvesor (String tipo){
        IConversor conversor = null;
        if(tipo.equalsIgnoreCase("temeratura")){
            conversor= new ConversorTemperatura();
        }else if (tipo.equalsIgnoreCase("energia")){
            conversor = new ConversorEnergia();
        }else if (tipo.equalsIgnoreCase("peso")){
            conversor = new ConversorPeso();
        }else if (tipo.equalsIgnoreCase("distancia")){
            conversor = new ConversorDistancia();
        }
        return conversor;
    }
}
