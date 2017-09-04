/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperatura;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Conversor {
    
    Scanner unScanner = new Scanner(System.in);
    String unidad_temperatura1;
    String unidad_temperatura2;
    double grados1;
    double grados2;
    
    public void EjecutarConversor(){
        System.out.println("Ingrese unidad de temperatura (Celsius, Farenheit, Kelvin)");
        unidad_temperatura1 = unScanner.nextLine();
        System.out.println("Ingrese los grados");
        String sringgrados1 = unScanner.nextLine();
        grados1 = Double.parseDouble(sringgrados1); 
        System.out.println("Ingrese a la unidad de temperatura que desea convertir (Celsius, Farenheit, Kelvin)");
        unidad_temperatura2 = unScanner.nextLine();;
        if(unidad_temperatura1 == "Celsius"){
            if(unidad_temperatura2 == "Farenheit"){
                grados2= ((9/5)*grados1)+32;
            }
            if(unidad_temperatura2 == "Kelvin"){
                grados2= (grados1+273.15);
            }
        }
        if(unidad_temperatura1 == "Farenheit"){
            if(unidad_temperatura2 == "Celsius"){
                grados2=(grados1-32)/1.8000;
            }
            if(unidad_temperatura2 == "Kelvin"){
                grados2=((grados1-32)/1.8000)+273.15;
            }
        }
        if(unidad_temperatura1 == "Kelvin"){
            if(unidad_temperatura2 == "Celsius"){
                grados2 = grados1-273.15;
            }
            if(unidad_temperatura2 == "Farenheit"){
                grados2 = 1.8*(grados1-273)+32;
            }
        }
        System.out.println(grados2+" Grados "+unidad_temperatura2);
    }
}
