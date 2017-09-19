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
public class ConversorPeso implements IConversor{


    //constructor de la clase
    public ConversorPeso() {
        
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
            case 1://de kilogramos a libras
                unidad = (2.20462 * valor);
                break;
            case 2://de kilogramos a onzas
                unidad = (35.274 * valor);
                break;
            case 3://de libras a kilogramos
                unidad = (0.453592 * valor);
                break;
            case 4://de libras a onzas
                unidad = (16 * valor);
                break;
            case 5://de onzas a kilogramos
                unidad = (0.0283495 * valor);
                break;
            case 6://de onzas a libras
                unidad = (0.0625 * valor);
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
        
        lista_de_unidades.add("-----------------------");
        lista_de_unidades.add("De Kilogramos a Libras");
        lista_de_unidades.add("De Kilogramos a Onzas");
        lista_de_unidades.add("De Libras a Kilogramos");
        lista_de_unidades.add("De Libras a Onzas");
        lista_de_unidades.add("De Onzas a Kilogramos");
        lista_de_unidades.add("De Onzas a Libras");
        
        return lista_de_unidades;  
    }

   
}
