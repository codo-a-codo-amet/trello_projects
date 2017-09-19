/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorx;

import java.util.List;

/**
 *
 * @author alumno
 */
public interface IConversor {

    public String getCelsiusConvertir(String temA, int select);

    public String getFarengeiConvertir(String temA, int select);

    public String getKelvinconvertir(String temA, int select);

    public double getLimitarDecimales(double temperatura);
    
    public List <String> getUnitList();
    
}
