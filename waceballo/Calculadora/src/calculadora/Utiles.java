/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class Utiles {

    public String FormatoDecimal(String valor) {
        String formato = "";

        for (int i = 0; i < valor.length(); i++) {
            formato = valor.substring(i, i + 1);
            System.out.println("ver " + formato);
            if (formato.length() == 3) {

                formato = formato + ".";
            System.out.println("ver " + formato);
//} else {
            //    formato = valor.substring(i, i);
            }
        }

        return formato;
    }
}
