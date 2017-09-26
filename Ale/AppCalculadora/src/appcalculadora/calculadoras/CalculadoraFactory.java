/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class CalculadoraFactory {

    public static ICalculadora CreateConversor(String type) {
        Object conversor = null;

        if (type.equalsIgnoreCase("Distancia")) {
            conversor = new Object();
        } else if (type.equalsIgnoreCase("Masa")) {
            conversor = new Object();
        }
        return (ICalculadora)conversor;
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
