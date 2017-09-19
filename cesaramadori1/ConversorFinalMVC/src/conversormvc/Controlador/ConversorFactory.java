/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorFactory {

    public static IConversor CrearConvesor (String tipo){
        IConversor conversor = null;
        if(tipo.equalsIgnoreCase("Temperatura")){
            conversor= new ConversorTemperatura();
        }else if (tipo.equalsIgnoreCase("Energia")){
            conversor = new ConversorEnergia();
        }else if (tipo.equalsIgnoreCase("Peso")){
            conversor = new ConversorPeso();
        }else if (tipo.equalsIgnoreCase("Distancia")){
            conversor = new ConversorDistancia();
        }
        return conversor;
    }
    
    public static List<String> getConversorList() {
        List<String> conversorList = new ArrayList<>();
        conversorList.add("Temperatura");
        conversorList.add("Energia");
        conversorList.add("Peso");
        conversorList.add("Distancia");
        return conversorList ;
    }
}
