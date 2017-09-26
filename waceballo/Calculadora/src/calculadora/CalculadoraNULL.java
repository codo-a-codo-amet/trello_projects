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
 * @author alumno
 */
public class CalculadoraNULL implements ICalculadora{

    @Override
    public Double Operaciones(Double num1, Double num2, String signo) {
        return 0.00;
    }
        
    @Override
    public List<String> getOpciones() {
                List<String> lista_de_unidades = new ArrayList<>();
        
        lista_de_unidades.add("---------------------");
        
        return lista_de_unidades;

    }

}
