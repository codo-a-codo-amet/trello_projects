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
public class ConversorNumerico implements IConversor{



    //constructor de la clase
    public ConversorNumerico() {
        //setTemperaturaConvertida(0);
    }

    /**
     * Metodo para convetir unidaderatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la unidaderatura convertida
     */    
    
    @Override
    public double Convertir(int opcion, Double valor) {
        double unidad;

        switch (opcion) {
            case 1://de Decimal a Hexadecimal
                unidad = (860.421 * valor);
                break;
            case 2://de Hexadecimal a Decimal
                unidad = (3.6e+6 * valor);
                break;
            default:
                unidad = 0.00;
                break;
        }
        return unidad;    }

    @Override
    public List<String> getOpciones() {
        List<String> lista_de_unidades = new ArrayList<>();
        
        lista_de_unidades.add("-------------------------");
        lista_de_unidades.add("De Decimal a Hexadecimal");
        lista_de_unidades.add("De Hexadecimal a Decimal");
        
        return lista_de_unidades;   
    }

   
}
