/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorFactory {
    
    public static IConversor CrearConversor (String tipo){
        IConversor conversor = null;
       if (tipo.equalsIgnoreCase("Distancia")) {
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("Masa")) {
            conversor = new ConversorDis();
        }
        return conversor;
    }
    
     public static List<String> GetConversorList() {
        List<String> lista_de_conversores = new ArrayList<>();

        lista_de_conversores.add("Temperatura");  // 1 celius a fehrr
        lista_de_conversores.add("Masa");
        lista_de_conversores.add("Distancia");
       

        return lista_de_conversores;

    }
    
    
}
