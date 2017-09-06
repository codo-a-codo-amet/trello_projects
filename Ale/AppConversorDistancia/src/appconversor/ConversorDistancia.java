/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor;

/**
 *
 * @author alumno
 */
public class ConversorDistancia {

    protected float value;
    protected String unit;

    public ConversorDistancia() {
        value = 0.0f;
        unit = "";
    }

    public void setValue(float newValue) {
        value = newValue;
    }

    public void setUnit(String newUnit) {
        unit = newUnit;
    }

    public void setValeUnit(float newValue, String newUnit) {
        value = newValue;
        unit = newUnit;
    }

    public float convertToUnit(String newUnit) {
        float tempValue = 0.0f;
        if (unit.equalsIgnoreCase("C")) {
            if (newUnit.equalsIgnoreCase("K")) {
                tempValue = value + 273.15f;
            }
        }
        return tempValue;
    }
}
