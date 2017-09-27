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
        ICalculadora calcuadora = null;

        if (type.equalsIgnoreCase("Simple")) {
            calcuadora = new CalculadoraSimple();
        } else if (type.equalsIgnoreCase("---")) {
            calcuadora = null;
        }
        return calcuadora;
    }

    public static List<String> GetConversorList() {
        List<String> lista_de_conversores = new ArrayList<>();
        
        lista_de_conversores.add("------");
        lista_de_conversores.add("Simple");  // 1 celius a fehrr


        return lista_de_conversores;

    }

}
