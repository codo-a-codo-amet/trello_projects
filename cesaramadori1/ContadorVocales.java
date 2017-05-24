/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.de.gestion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int cuantasvocales_a;
        int cuantasvocales_a_acentuadas;
        int cuantasvocales_e;
        int cuantasvocales_e_acentuadas;
        int cuantasvocales_i;
        int cuantasvocales_i_acentuadas;
        int cuantasvocales_o;
        int cuantasvocales_o_acentuadas;
        int cuantasvocales_u;
        int cuantasvocales_u_acentuadas;
        int e;
        int i;
        int o1;
        String texto;
        int totalvocales;
        int u;
		// By Guru3k1
        //texto = "Una vez que cierres todas las pestañas de incógnito, las páginas que hayas visitado en ese modo no se guardarán en el historial del navegador, en la lista de cookies ni en el historial de búsquedas. Se guardarán los archivos que descargues y los favoritos que crees.Sin embargo, no eres invisible. El modo de navegación de incógnito no oculta tu navegación de tu empleador, de tu proveedor de servicios de Internet, ni de los sitios web que visitas.";
        System.out.println("Ingrese un texto para contar sus vocales.");
        texto = sc.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Calculemos las vocales en el texto.");
        System.out.println(" ");
        System.out.println("|" + texto + "|");
        System.out.println(" ");
        cuantasvocales_a = haycaracter(texto, "a");
        cuantasvocales_a_acentuadas = haycaracter(texto, "á");
        a = cuantasvocales_a + cuantasvocales_a_acentuadas;
        System.out.println("En el texto hay " + a + " letras a.");
        System.out.println("-----------------------------");
        cuantasvocales_e = haycaracter(texto, "e");
        cuantasvocales_e_acentuadas = haycaracter(texto, "é");
        e = cuantasvocales_e + cuantasvocales_e_acentuadas;
        System.out.println("En el texto hay " + e + " letras e.");
        System.out.println("-----------------------------");
        cuantasvocales_i = haycaracter(texto, "i");
        cuantasvocales_i_acentuadas = haycaracter(texto, "í");
        i = cuantasvocales_i + cuantasvocales_i_acentuadas;
        System.out.println("En el texto hay " + i + " letras i.");
        System.out.println("-----------------------------");
        cuantasvocales_o = haycaracter(texto, "o");
        cuantasvocales_o_acentuadas = haycaracter(texto, "ó");
        o1 = cuantasvocales_o + cuantasvocales_o_acentuadas;
        System.out.println("En el texto hay " + o1 + " letras o.");
        System.out.println("-----------------------------");
        cuantasvocales_u = haycaracter(texto, "u");
        cuantasvocales_u_acentuadas = haycaracter(texto, "ú");
        u = cuantasvocales_u + cuantasvocales_u_acentuadas;
        System.out.println("En el texto hay " + u + " letras u.");
        System.out.println("-----------------------------");
        totalvocales = a + e + i + o1 + u;
        System.out.println("La suma total de las vocales en el texto es " + totalvocales + " vocales.");

    }

    public static int haycaracter(String palabra, String caracter) {
        int contador;
        String elcaracter;
        int sihaycaracter;
        String textos;
        contador = 0;
        sihaycaracter = 0;
        textos = palabra.toLowerCase();
        do {
            elcaracter = textos.substring(contador, contador + 1);
            if ((elcaracter.equals(caracter))) {
                sihaycaracter = sihaycaracter + 1;
            }
            contador = contador + 1;
        } while (contador < textos.length());
        return sihaycaracter;
    }
}
