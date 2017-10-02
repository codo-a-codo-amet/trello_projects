/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wceba
 */
public class ConversorFactory {

    public static ICalculadora CrearConversor(String tipo) {
        ICalculadora conversor = null;

        if (tipo.equalsIgnoreCase("Seleccione")) {
            conversor = new CalculadoraNULL();
        }else if (tipo.equalsIgnoreCase("Simple")) {
            conversor = new CalculadoraSimple();
        }

        return conversor;
    }

    public static List<String> getListaConversores() {
        List<String> lista_de_conversores = new ArrayList<>();

        lista_de_conversores.add("Seleccione");
        lista_de_conversores.add("Simple");
        
        return lista_de_conversores;
    }

}
