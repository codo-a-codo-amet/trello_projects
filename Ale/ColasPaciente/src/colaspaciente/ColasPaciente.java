
package colaspaciente;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ColasPaciente {

    public static void main(String[] args) {
   llenar();
    }

    static String nombre() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre", "Ingreso", -1);
        return nombre;
    }

    static void llenar() {
        LinkedList cola = new LinkedList();
        String cadena = "Pacientes\n";
        String[] paciente = new String[3];
        for (int i = 0; i < paciente.length; i++) {
            paciente[i] = nombre();
            cola.add(paciente[i]);
            cadena = cadena + cola.get(i) + "   ";
        }
        
        cadena = cadena + "\nIngreso de pacientes\n";
        for (int i = 0; i < paciente.length; i++) {
            cadena = cadena + cola.remove() + " dirigirse al box " + box()+"\n";
        }
        JOptionPane.showMessageDialog(null, cadena, "Pacientes", -1);
    }

    static int box() {
        int numero = (int) (Math.random() * 10 + 1);
        return numero;
    }   
}
    

