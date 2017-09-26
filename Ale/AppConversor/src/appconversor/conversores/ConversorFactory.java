/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor.conversores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorFactory {

    public static IConversor CreateConversor(String type) {
        IConversor conversor = null;

        if (type.equalsIgnoreCase("Distancia")) {
            conversor = new ConversorDistancia();
        } else if (type.equalsIgnoreCase("Masa")) {
            conversor = new ConversorMasa();
        }
        return conversor;
    }

    public static List<String> GetConversorList() {
        List<String> lista_de_conversores = new ArrayList<>();
        
        lista_de_conversores.add("------");
        lista_de_conversores.add("Distancia");  // 1 celius a fehrr
        lista_de_conversores.add("Masa");
        lista_de_conversores.add("ada");
        lista_de_conversores.add("dasd");
        lista_de_conversores.add("dad");

        return lista_de_conversores;

    }

}
