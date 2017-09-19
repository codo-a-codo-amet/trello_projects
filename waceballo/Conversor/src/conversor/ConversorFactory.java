/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wceba
 */
public class ConversorFactory {

    public static IConversor CrearConversor(String tipo) {
        IConversor conversor = null;

        if (tipo.equalsIgnoreCase("Temperatura")) {
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("Distancia")) {
            conversor = new ConversorDistancia();
        } else if (tipo.equalsIgnoreCase("Energia")) {
            conversor = new ConversorEnergia();
        } else if (tipo.equalsIgnoreCase("Peso")) {
            conversor = new ConversorPeso();
        }

        return conversor;
    }

    public static List<String> getListaConversores() {
        List<String> lista_de_conversores = new ArrayList<>();

        lista_de_conversores.add("Temperatura");
        lista_de_conversores.add("Distancia");
        lista_de_conversores.add("Energia");
        lista_de_conversores.add("Peso");

        return lista_de_conversores;
    }

}
