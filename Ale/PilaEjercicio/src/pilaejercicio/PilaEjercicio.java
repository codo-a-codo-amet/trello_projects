
package pilaejercicio;

import java.util.Stack;
import javax.swing.JOptionPane;

public class PilaEjercicio {

    public static void main(String[] args) {
invertirPalabra(texto());
    }
static String texto(){
    String texto = JOptionPane.showInputDialog(null, "Ingrese palabra", "Ingreso", -1);
        return texto;
    }

    static void invertirPalabra(String texto) {
        Stack pila = new Stack();
        char[] letras = texto.toCharArray();
        String cadena ="Palabra ingresada: ";
        for (int i = 0; i < letras.length; i++) {
            pila.push(letras[i]);
             cadena = cadena + pila.peek();
        }
        cadena = cadena + "\nPalabra invertida: ";
        while (pila.empty()!= true){
            cadena = cadena + pila.pop();
        }
        JOptionPane.showMessageDialog(null, cadena, "Impresion", -1);

    }
}