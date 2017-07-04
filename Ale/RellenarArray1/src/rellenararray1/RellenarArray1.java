
package rellenararray1;

import javax.swing.JOptionPane;

public class RellenarArray1 {

    public static void main(String[] args) {
    int[] array = new int[solicitarLonguitud()];
        array = rellenarArray(array);
        mostrarArray(array);

    }

    static int solicitarLonguitud() {

        int longuitud = 0;

        do {

            longuitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas posiciones va a tener la array: ", "Ingreso", JOptionPane.PLAIN_MESSAGE));

            if (longuitud < 1 || longuitud > 10) {
                JOptionPane.showMessageDialog(null, "La longuitud del vector debe ser mayor que 0 y menor que 10", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } while (longuitud < 1 || longuitud > 10);

        return longuitud;
    }

    static int[] rellenarArray(int []array) {
        int aleatorio;

        for (int i = 0; i < array.length; i++) {

            aleatorio = (int) (Math.random() * 10) + 1;

            array[i] = aleatorio;

        }
        return array;
    }

    static void mostrarArray(int array[]) {

        String cadena = "Vamos a mostar la Array\n";

        for (int i = 0; i < array.length; i++) {
            cadena = cadena + "Para la posicion " + i + " el valor es " + array[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena, "Imprimir", -1);

    }
}