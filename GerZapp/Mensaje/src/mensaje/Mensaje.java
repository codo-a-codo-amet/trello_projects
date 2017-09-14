/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Mensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        int suma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
        suma = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + "\n +" + num2 + "\n------------\n" + suma);
    }

}
