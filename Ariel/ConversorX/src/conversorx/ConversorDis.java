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
public class ConversorDis implements IConversor{
    
    private double celcius;
    private double kelvin;
    private double farengei;
    private double temperaturaConvertida;
    private String laTemperatura;

    public ConversorDis() {
        
    }
    

    public ConversorDis(double celcius, double kelvin, double farengei, double temperaturaConvertida) {
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
    
    //A partir de acá no usé nada.
    
    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFarengei() {
        return farengei;
    }

    public void setFarengei(double farengei) {
        this.farengei = farengei;
    }

    public double getTemperaturaCovertida() {
        return temperaturaConvertida;
    }

    public void setTemperaturaCovertida(double temperaturaCovertida) {
        this.temperaturaConvertida = temperaturaCovertida;
    }

    @Override
    public List<String> getUnitList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
