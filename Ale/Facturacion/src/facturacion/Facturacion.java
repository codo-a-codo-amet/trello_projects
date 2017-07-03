
package facturacion;

import javax.swing.JOptionPane;

public class Facturacion {

    public static void main(String[] args) {
       rellenar();

    }

    static int idProducto() {
        int id = 1000;
        return id;
    }

    static double cantLitros() {
        double litros = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de litros vendidos: ", "Venta", -1));
        return litros;
    }

    static double precioLitros() {
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese precio por litro: ", "Venta", -1));
        return precio;
    }

    static void rellenar() {
        int[] id = new int[3];
        double[] precio = new double[3];
        double[] litros = new double[3];
        double[] total = new double[3];
        int mas600 = 0;

        for (int i = 0; i < 3; i++) {
            id[i] = idProducto() + (i);
            litros[i] = cantLitros();
            precio[i] = precioLitros();
            total[i] = litros[i] * precio[i];
            if (total[i] >= 600) {
                mas600++;
            }
        }
        imprimir(id, precio, litros, total, mas600);
    }

    static void imprimir(int[] id, double[] precio, double[] litros, double[] total, int mayor) {
        for (int i = 0; i < 3; i++) {

            JOptionPane.showMessageDialog(null, "La factura nº " + (i + 1) + " \nCodigo: " + id[i] + "        " + " litros vendidos: " + litros[i] + "        " + " importe total: " + total[i], "Factura nº " + (i + 1), -1);
        }
        JOptionPane.showMessageDialog(null, mayor + " facturas son superiores a 600$");
    }
}