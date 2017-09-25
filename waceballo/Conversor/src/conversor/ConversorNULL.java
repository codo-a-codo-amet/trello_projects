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
 * @author alumno
 */
public class ConversorNULL implements IConversor{

    @Override
    public double Convertir(int opcion, Double valor) {
        return 0.00;
    }

    @Override
    public List<String> getOpciones() {
                List<String> lista_de_unidades = new ArrayList<>();
        
        lista_de_unidades.add("-------------------------");
        
        return lista_de_unidades;

    }
    
}
