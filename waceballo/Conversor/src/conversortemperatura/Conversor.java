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
public class Conversor implements IConversor{

    //constructor de la clase
    public Conversor() {
        //setTemperaturaConvertida(0);
    }

    /**
     * Metodo para convetir temperatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la temperatura convertida
     */    
    public float Convertir(int opcion, int valor) {
        float temp;
        
        switch (opcion) {
            case 1:
                temp = (valor * 9 / 5) + 32;
                break;
            case 2:
                temp = 2;
                break;
            case 3:
                temp = 3;
                break;
            case 4:
                temp = 4;
                break;
            case 5:
                temp = 5;
                break;
            case 6:
                temp = 6;
                break;
            default:
                temp = 0;
=======
    public double ConvertirTemperatura(int opcion, Double valor) {
        double temp;

        switch (opcion) {
            case 1://de fahrenheit a celsius
                temp = (valor * 9 / 5) + 32;
                break;
            case 2://de celsius a fahrenheit
                temp = (valor - 32) * 5 / 9;
                break;
            case 3://de celsius a kelvin
                temp = valor + 273.15;
                break;
            case 4://de kelvin a celsius
                temp = valor - 273.15;
                break;
            case 5://de kelvin a fahrenheit
                temp = 9 * (valor - 273.15) / 5 + 32;
                break;
            case 6://de fahrenheit a kelvin
                temp = 5 * (valor - 32) / 9 + 273.15;
                break;
            default:
                temp = 0.00;
>>>>>>> 5b7939faa19cf1c45670772961056ea69a525aaa
                break;
        }
        return temp;
    }

   
}
