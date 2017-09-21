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
public class ConversorVelocidad implements IConversor{

    //constructor de la clase
    public ConversorVelocidad() {
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
            case 1://de km/h a millas/h
                //1 km/h = 0,621371 millas/h
                unidad = (0.621371 * valor);
                break;
            case 2://de millas/h a km/h
                //1 milla/h = 1,60934 km/h
                unidad = (1.60934 * valor);
                break;
            case 3://de km/h a metros por segundo
                // 1 km/h = 0,277778 metros pro segundo
                unidad = (0.277778 * valor);
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
        
        lista_de_unidades.add("-------------------------");
        lista_de_unidades.add("De Km/h a Millas/");
        lista_de_unidades.add("De Millas/h a Km/h");
        lista_de_unidades.add("De Km/h a Metros por Segundos");
        
        return lista_de_unidades;
    }

   
}
