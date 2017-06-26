/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuento_jop;

import javax.swing.JOptionPane;

public class Descuento_JOP {
static String mes="";
static double precio =0.0;

    public static void main(String[] args) {
    carga();    
    String cadena =Descuento(mes);
        cadena=cadena+"\n";
        cadena=cadena+(Descuento(mes))+ " ";
     JOptionPane.showMessageDialog(null,cadena,"",JOptionPane.WARNING_MESSAGE);   
        
    }
    
    static void carga(){
    mes=JOptionPane.showInputDialog(null,"Ingrese el mes:","Mes",JOptionPane.INFORMATION_MESSAGE);
    precio= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el importe de la compra:","Compra",JOptionPane.QUESTION_MESSAGE));
    
    }
    static String Descuento (String m){
        if (m=="octubre") {
            double descuento = precio*0.15;
        return "Descuento de octubre:\n"+descuento;
            
        } else {
          return "Mes sin descuento:\n"+precio;
        }
   
    }

}
