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
public class CalculadoraFactory {

    public static ICalculadora CrearCalculadora(String tipo) {
        ICalculadora calculadora = null;

        if (tipo.equalsIgnoreCase("Seleccione")) {
            calculadora = new CalculadoraNULL();
        }else if (tipo.equalsIgnoreCase("Simple")) {
            calculadora = new CalculadoraSimple();
        }

        return calculadora;
    }

    public static List<String> getListaConversores() {
        List<String> lista_de_calculadoras = new ArrayList<>();

        //lista_de_calculadoras.add("Seleccione");
        lista_de_calculadoras.add("Simple");
        
        return lista_de_calculadoras;
    }

}
