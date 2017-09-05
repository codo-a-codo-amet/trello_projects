/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

/**
 *
 * @author alumno
 */
public class Conversion {

        double FahrenheitACelsius(double grado) {
        double gCelcius = (grado - 32) / 1.8;
        return gCelcius;
    }

     double CelsiusAFahrenheit(double grado) {
        double gFahrenheit = (grado * 1.8) + 32;
        return gFahrenheit;
    }   
    
    }
               
        
  
