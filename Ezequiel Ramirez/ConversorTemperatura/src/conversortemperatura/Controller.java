/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Controller {

    protected Conversion Conversion;
    protected myView myview;
    
    
    public Controller(){
        double grado = 0, gCelsius = 0, gFahrenheit = 0;
        Conversion temp = new Conversion();

        int opcion = 0;
        String cadena;

        do {
            cadena = JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit");
            opcion = Integer.parseInt(cadena);
        } while (opcion < 1 || opcion > 2);
        cadena = JOptionPane.showInputDialog("Ingrese la temperatura: ");
        grado = Double.parseDouble(cadena);

        switch (opcion) {

            case 1: {
                gCelsius = temp.FahrenheitACelsius(grado);
                JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gCelsius + " Celsius");
            }
            ;
            break;

            case 2: {
                gFahrenheit = temp.CelsiusAFahrenheit(grado);
                JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gFahrenheit + " Fahrenheit");
            }
            ;
            break;
    }
    
    }
    


