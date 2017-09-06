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
public class ConversorDistancia {

    public ConversorDistancia() {
        
    }
    /* Tabla de valores 
    1 KM 
    2 Millas
    3 Yardas
    */
    final Double millaK = 1.609344;
    final Double Kmilla = 0.62137;
    final Double millaY= 1760.00;
    final Double Ymilla= 0.0006;
    final Double Ykm = 0.0009;
    final Double kmy = 1093.61329833;
    public Double convertir (Double valor, int ti , int to ){
    
    Double valorConvertido=null;
        if(ti==1){
            switch(to){
                case 1:
                    valorConvertido = valor;
                    break;
                case 2:
                    valorConvertido = valor * Kmilla;
                    break;
                case 3:
                    valorConvertido = valor * kmy;
                    break;
            }
        }    
        if(ti==2){
            switch(to){
                case 1:
                    valorConvertido = valor*millaK ;
                    break;
                case 2:
                    valorConvertido = valor;
                    break;
                case 3:
                    valorConvertido = valor * millaY;
                    break;
            }    
        }
        if(ti==3){
            switch(to){
                case 1:
                    valorConvertido = valor *Ykm;
                    break;
                case 2:
                    valorConvertido = valor* Ymilla;
                    break;
                case 3:
                    valorConvertido = valor;
                    break;
            }
        }
    return valorConvertido;

}
}