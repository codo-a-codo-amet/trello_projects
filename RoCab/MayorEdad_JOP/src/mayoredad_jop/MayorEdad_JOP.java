/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoredad_jop;

import javax.swing.JOptionPane;

public class MayorEdad_JOP {
static String nombre="";
static int edad =0;

    public static void main(String[] args) {
    carga();    
    String cadena =Mayor(edad);
        cadena=cadena+"\n";
        cadena=cadena+(Mayor(edad))+ " ";
     JOptionPane.showMessageDialog(null,cadena,"",JOptionPane.WARNING_MESSAGE);   
        
    }
    
    static void carga(){
    nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre:","Nombre",JOptionPane.INFORMATION_MESSAGE);
    edad= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad:","Edad",JOptionPane.QUESTION_MESSAGE));
    
    }
    static String Mayor (int e){
        if (e>=18) {  
        return "Es mayor de edad.";
            
        } else {
          return "Es menor de edad.";
        }
   
    }

}
