/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorVelocidad implements IConversor{

    public ConversorVelocidad() {
        
    }
    /* Tabla de valores 
    1 KM/h 
    2 Millas/h
    3 Metros/s
    */
    final Double millaK = 1.60934;
    final Double Kmilla = 0.621371;
    final Double millametro= 0.44704;
    final Double metromilla= 2.23694;
    final Double metrosSegungokm = 3.6;
    final Double kmmsegundos = 0.277778;
    public Double convertir (Double valor, int ti , int to ){
    
    Double valorConvertido=null;
        if(ti==1){
            switch(to){
                case 1:
                    valorConvertido = valor;
                    break;
                case 2:
                    valorConvertido = valor * Kmilla;
                    break;
                case 3:
                    valorConvertido = valor * kmmsegundos;
                    break;
            }
        }    
        if(ti==2){
            switch(to){
                case 1:
                    valorConvertido = valor*millaK ;
                    break;
                case 2:
                    valorConvertido = valor;
                    break;
                case 3:
                    valorConvertido = valor * millametro;
                    break;
            }    
        }
        if(ti==3){
            switch(to){
                case 1:
                    valorConvertido = valor *metrosSegungokm;
                    break;
                case 2:
                    valorConvertido = valor* metromilla;
                    break;
                case 3:
                    valorConvertido = valor;
                    break;
            }
        }
    return valorConvertido;

}

    @Override
    public List<String> getUnitList() {
        List<String> unitList = new ArrayList<>();
        unitList.add("Km/h");
        unitList.add("Millas/h");
        unitList.add("m/s");
        return unitList ;
    }
}