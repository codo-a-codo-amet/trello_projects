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
public class ConversorTemperatura implements IConversor {

    public ConversorTemperatura() {
        
    }
    /* Tabla de valores 
    1 Celcius
    2 Kelvin
    3 Farenheit
    */
    public Double convertir (Double valor, int ti , int to ){
    Double valorKelvin = 273.00;
    Double valorConvertido=null;
        if(ti==1){
            switch(to){
                case 1:
                    valorConvertido = valor;
                    break;
                case 2:
                    valorConvertido = valor + valorKelvin;
                    break;
                case 3:
                    valorConvertido = (valor*(9/5))+32;
                    break;
            }
        }    
        if(ti==2){
            switch(to){
                case 1:
                    valorConvertido = valor-valorKelvin ;
                    break;
                case 2:
                    valorConvertido = valor;
                    break;
                case 3:
                    valorConvertido = ((valor-273)*(9/5))+32;
                    break;
            }    
        }
        if(ti==3){
            switch(to){
                case 1:
                    valorConvertido = (valor-32)*5/9;
                    break;
                case 2:
                    valorConvertido = valorKelvin+(valor-32)*5/9;
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
        unitList.add("Celcius");
        unitList.add("Kelvin");
        unitList.add("Farenheit");
        return unitList ;
    
    }
}