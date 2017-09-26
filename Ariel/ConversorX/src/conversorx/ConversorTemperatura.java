/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ConversorTemperatura implements IConversor  {
    //convertir de KWh, Caloria, j
    private double celcius;
    private double kelvin;
    private double farengei;
    private double temperaturaConvertida;
    private String laTemperatura;

    public ConversorTemperatura() {
        
    }
    

    public ConversorTemperatura(double celcius, double kelvin, double farengei, double temperaturaConvertida) {
        this.celcius = celcius;
        this.kelvin = kelvin;
        this.farengei = farengei;
        this.temperaturaConvertida = temperaturaConvertida;
    }
    
   
  
    
   
    public String getCelsiusConvertir(String temA,int select){
        double resultado =0.0;
        switch(select) {
            // la opcion 1 convierte a Kelvin y la 2 a fahrenheit.
            case 1: resultado = Double.parseDouble(temA) * 0.62137;break;
            case 2: resultado = (Double.parseDouble(temA) * 1093.6133);break;
        }
            temperaturaConvertida = getLimitarDecimales(resultado);
            laTemperatura = Double.toString(temperaturaConvertida);
        return laTemperatura ;
    }
    
   
    public String getKelvinconvertir(String temA,int select){
        double resultado = 0.;
     
        switch(select) {
            // la opcion 1 convierte a celsius y la 2 a fahrenheit.
            case 1: resultado = Double.parseDouble(temA) * 1.6093;break;
            case 2: resultado = Double.parseDouble(temA) * 1760;break;
        }
            temperaturaConvertida = getLimitarDecimales(resultado);
            laTemperatura = Double.toString(temperaturaConvertida);
        return laTemperatura ;
    }

  
    
   
    public String getFarengeiConvertir(String temA,int select){
        double resultado = 0.;
        switch(select) {
            //la opcion 1 convierte a celcius y la 2 a kelvin.
            case 1: resultado = (Double.parseDouble(temA) *0.000914399);break;
            case 2: resultado = (Double.parseDouble(temA) *0.000568181);break;
        }
           temperaturaConvertida = getLimitarDecimales(resultado);
            laTemperatura = Double.toString(temperaturaConvertida);
        return laTemperatura ;
    }
    
   
    public double getLimitarDecimales(double temperatura){
        double decimalesReducidos;
        double a;
        int valorEntero;
        a = temperatura * 100;
        valorEntero = (int)a;
        decimalesReducidos = (double)valorEntero / 100;
        
        return decimalesReducidos;
    }

   
    public List<String> getUnitList() {
        List<String> lista_de_unidades = new ArrayList();
        
        return lista_de_unidades;
    }

    @Override
    public void setUnit(String newUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValeUnit(float newValue, String newUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValue(float newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float convertToUnit(String newUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
}
