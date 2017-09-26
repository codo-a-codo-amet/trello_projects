/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor.conversores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorMasa implements IConversor {

    protected float value;
    protected String unit;

    public ConversorMasa() {
        value = 0.0f;
        unit = "";
    }

    @Override
    public void setValue(float newValue) {
        value = newValue;
    }

    @Override
    public void setUnit(String newUnit) {
        unit = newUnit;
    }

    @Override
    public void setValeUnit(float newValue, String newUnit) {
        value = newValue;
        unit = newUnit;
    }

    @Override
    public float convertToUnit(String newUnit) {
        float tempValue = 0.0f;
        if (unit.equalsIgnoreCase("C")) {
            if (newUnit.equalsIgnoreCase("K")) {
                tempValue = value + 273.15f;
            }
        }
        return tempValue;
    }
    
     @Override
    public List<String> getUnitList() {
        List<String> lista_de_unidades = new ArrayList<>();
        
        lista_de_unidades.add("celsiu a farhnadad");  // 1 celius a fehrr
        lista_de_unidades.add("millas");
        
        return lista_de_unidades;
        
    }
}
