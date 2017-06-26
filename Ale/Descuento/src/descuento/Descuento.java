
package descuento;

import javax.swing.JOptionPane;

public class Descuento{
   static String mes = "";
    static double precio = 0;
    static double precioFinal = 0;

    public static void main(String[] args) {

        carga();
        precioFinal = precioFinal(mes, precio);
        imprimir();
    }

    static void carga() {
        mes = JOptionPane.showInputDialog(null, "Ingrese mes ","Mes",JOptionPane.WARNING_MESSAGE);
        precio =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese precio del producto","Precio",JOptionPane.WARNING_MESSAGE));

    }

    static double precioFinal(String mes, double precio) {
        if ("octubre".equalsIgnoreCase(mes)) {
            precio = precio * 0.85;
            return precio;

        } else {
            return precio;

        }
    }
    static void imprimir(){
    JOptionPane.showConfirmDialog(null, "El monto a cobrar es " + precioFinal(mes,precio),"Resultado",JOptionPane.PLAIN_MESSAGE);
    }
}