/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this unidadlate file, choose Tools | Templates
 * and open the unidadlate in the editor.
 */
package conversor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorDistancia implements IConversor{

    //constructor de la clase
    public ConversorDistancia() {
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
            case 1://de yardas a km
                //1 yarda = 0.0009144 km
                unidad = (0.0009144 * valor);
                break;
            case 2://de yardas a millas
                //1 yarda = 0,000568182 milla
                unidad = (0.000568182 * valor);
                break;
            case 3://de km a yardas
                unidad = (1093.61 * valor);
                break;
            case 4://de km a millas
                unidad = (0.621371 * valor);
                break;
            case 5://de milla a yardas
                unidad = (1760 * valor);
                break;
            case 6://de milla a km
                unidad = (1.60934 * valor);
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
        lista_de_unidades.add("De Yardas a Kilometros");
        lista_de_unidades.add("De Yardas a Millas");
        lista_de_unidades.add("De Kilometros a Yardas ");
        lista_de_unidades.add("De Kilometros a Millas");
        lista_de_unidades.add("De Millas a Yardas");
        lista_de_unidades.add("De Millas a Kilometros");
        
        return lista_de_unidades;
    }

   
}
