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
public class ConversorPeso {

    public ConversorPeso() {
        
    }
    /* Tabla de valores 
    1 Kg
    2 Libra
    3 Onz
    */
    final Double poundk = 0.4536;
    final Double Kgpound = 2.204622;
    final Double puonOnz= 16.00;
    final Double OnzPound= 0.0625;
    final Double Onzkg = 0.0283;
    final Double kgOnz = 35.273961;
    public Double convertir (Double valor, int ti , int to ){
    
    Double valorConvertido=null;
        if(ti==1){
            switch(to){
                case 1:
                    valorConvertido = valor;
                    break;
                case 2:
                    valorConvertido = valor * Kgpound;
                    break;
                case 3:
                    valorConvertido = valor * kgOnz;
                    break;
            }
        }    
        if(ti==2){
            switch(to){
                case 1:
                    valorConvertido = valor*poundk ;
                    break;
                case 2:
                    valorConvertido = valor;
                    break;
                case 3:
                    valorConvertido = valor * puonOnz;
                    break;
            }    
        }
        if(ti==3){
            switch(to){
                case 1:
                    valorConvertido = valor *Onzkg;
                    break;
                case 2:
                    valorConvertido = valor* OnzPound;
                    break;
                case 3:
                    valorConvertido = valor;
                    break;
            }
        }
    return valorConvertido;

}
}