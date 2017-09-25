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
public class ConversorNULL implements IConversor{

    @Override
    public float convertToUnit(String newUnit) {
        return 0.0f;
   }

    @Override
    public void setUnit(String newUnit) {
    }

    @Override
    public void setValeUnit(float newValue, String newUnit) {
    }

    @Override
    public void setValue(float newValue) {
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista_vacia = new ArrayList<>();
        
        lista_vacia.add("----");
        return lista_vacia;
                
    }
    
}
