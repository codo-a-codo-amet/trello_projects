/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this unidadlate file, choose Tools | Templates
 * and open the unidadlate in the editor.
 */
package conversor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorEnergia implements IConversor {

    //constructor de la clase
    public ConversorEnergia() {
        //setTemperaturaConvertida(0);
    }

    /**
     * Metodo para convetir unidaderatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la unidaderatura convertida
     * @return 
     */    
    @Override
    public double Convertir(int opcion, Double valor) {
        double unidad;

        switch (opcion) {
            case 1://de kWh a Calorias
                unidad = (860.421 * valor);
                break;
            case 2://de kWh a Julio
                unidad = (3.6e+6 * valor);
                break;
            case 3://de Calorias a kWh
                unidad = (0.00116222 * valor);
                break;
            case 4://de Calorias a Julio
                unidad = (4184 * valor);
                break;
            case 5://de Julio a kWh
                unidad = (2.7778e-7 * valor);
                break;
            case 6://de Julio a Calorias
                unidad = (0.000239006 * valor);
                break;
            default:
                unidad = 0.00;
                break;
        }
        return unidad;
    }

    @Override
    public List<String> getOpciones() {
        List<String> lista_de_unidades = new ArrayList<>();
        
        lista_de_unidades.add("------------------------------");
        lista_de_unidades.add("De kWh a Calorias");
        lista_de_unidades.add("De kWh a Jullio");
        lista_de_unidades.add("De Calorias a kWh");
        lista_de_unidades.add("De Calorias Julio");
        lista_de_unidades.add("De Julio a kWh");
        lista_de_unidades.add("De Julio a Calorias");
        
        return lista_de_unidades;        
    }





  
}
