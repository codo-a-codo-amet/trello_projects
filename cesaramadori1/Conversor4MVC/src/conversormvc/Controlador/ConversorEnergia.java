/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorEnergia {

    public ConversorEnergia() {
        
    }
    /* Tabla de valores 
    1 kWh
    2 Calorias
    3 Jules
    */
    final Double calKwh = 0.000001163;
    final Double calJoules = 4.184;
    final Double kwhcal= 860420.65;
    final Double kwhjoules= 3600000.00;
    final Double jouleKwh = 2.7777777777778E-7;
    final Double joulescal = 0.239005736137667;
    public Double convertir (Double valor, int ti , int to ){
    
    Double valorConvertido=null;
        if(ti==1){
            switch(to){
                case 1:
                    valorConvertido = valor;
                    break;
                case 2:
                    valorConvertido = valor * kwhcal;
                    break;
                case 3:
                    valorConvertido = valor * kwhjoules;
                    break;
            }
        }    
        if(ti==2){
            switch(to){
                case 1:
                    valorConvertido = valor*calKwh ;
                    break;
                case 2:
                    valorConvertido = valor;
                    break;
                case 3:
                    valorConvertido = valor * calJoules;
                    break;
            }    
        }
        if(ti==3){
            switch(to){
                case 1:
                    valorConvertido = valor *jouleKwh;
                    break;
                case 2:
                    valorConvertido = valor* joulescal;
                    break;
                case 3:
                    valorConvertido = valor;
                    break;
            }
        }
    return valorConvertido;

}
}