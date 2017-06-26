package persona;

import javax.swing.JOptionPane;

public class Persona {

    static String nombre = "";
    static int edad = 0;

    public static void main(String[] args) {
        cargarDatos();
        Imprimir(nombre, edad);
    }

    static void cargarDatos() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre", "Nombre", JOptionPane.PLAIN_MESSAGE);
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad", "Edad", JOptionPane.PLAIN_MESSAGE));
    }

    static void Imprimir(String n, int e) {
        JOptionPane.showMessageDialog(null, n + " tiene " + e + " años y " + mayorEdad(e), "Datos", JOptionPane.PLAIN_MESSAGE);
    }

    static String mayorEdad(int e) {
        if (e >= 18) {
            return "es mayor de edad";
        } else {
            return "es menor de edad";
        }

    }
}
