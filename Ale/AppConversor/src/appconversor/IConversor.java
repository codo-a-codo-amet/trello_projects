/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor;

import java.util.List;

/**
 *
 * @author alumno
 */
public interface IConversor {

    public float convertToUnit(String newUnit);

    public void setUnit(String newUnit);

    public void setValeUnit(float newValue, String newUnit);

    public void setValue(float newValue);
    
    public List<String> getUnitList();
    
}
