
package ordenar;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ordenar {

    public static void main(String[] args) {
        int numDesor[] = llenar();
        imprimir(numDesor);
        int numOrd[] = ordenar(numDesor);
        imprimir(numOrd);

    }

    static int[] llenar() {
        int num[] = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        return num;
    }

    static void imprimir(int[] num) {
        String cadena = "";
        for (int i = 0; i < num.length; i++) {
            cadena = cadena + num[i] + "  ";
        }
        JOptionPane.showMessageDialog(null, cadena, "Numeros", JOptionPane.INFORMATION_MESSAGE);
    }

    static int[] ordenar(int[] num) {
        Arrays.sort(num);
        return num;
    }
}
