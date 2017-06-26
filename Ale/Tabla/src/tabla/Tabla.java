
package tabla;

import javax.swing.JOptionPane;

public class Tabla {

    static int numero1 = 0;
    static int numero2 = 0;
    static int division = 0;

    public static void main(String[] args) {
        cargaDatos();
        division = division(numero1, numero2);
        imprimirDatos();
    }

    static void cargaDatos() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero", "Numero", JOptionPane.INFORMATION_MESSAGE));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero", "Numero", JOptionPane.INFORMATION_MESSAGE));
    }

    static int division(int numero1, int numero2) {
        if (numero1 > numero2) {
            division = numero1 / numero2;
            return division;
        } else {
            division = numero2 / numero1;
            return division;
        }
    }

    static void imprimirDatos() {
        JOptionPane.showMessageDialog(null, "El resultado es: " + division(numero1, numero2));
    }
}