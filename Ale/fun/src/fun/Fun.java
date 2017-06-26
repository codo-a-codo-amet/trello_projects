
package fun;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fun {
static String nombre;
    static int  edad;

    public static void main(String[] args) {
 carga();
String cadena =  edad();
JOptionPane.showMessageDialog(null, cadena, "Informacion", JOptionPane.PLAIN_MESSAGE);
    }

    //Funcion
    static String edad() {
        String cadena="";
        if (edad > 18){ 
            return "La persona es mayor de edad";
           
    }else {
            return "La persona es menor de edad";
           
    }
    
    }

    // Procedimiento
    static void carga() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        nombre = teclado.next();
        System.out.println("edad");
         edad= teclado.nextInt();
       }
}