/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeahorcado;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Juego {

    Scanner unScanner = new Scanner(System.in);
    final static String[] LISTADO_DE_PALABRAS = {"JAVA", "CASA", "LLAVE", "AUTO", "PERRO"};
    private final String palabra_elejida;
    private final int numero_al_azar;
    private String mensaje;
    private int posibilidades;
    private int contador_letra_elejida;
    private int acerto_letra;

    //private List<String> palabra;
    //private final int letra_contador;
    public Juego() {
        numero_al_azar = 1 + new Random().nextInt(4);
        posibilidades = 6;
        contador_letra_elejida = 0;
        palabra_elejida = LISTADO_DE_PALABRAS[numero_al_azar];
        acerto_letra = 0;
        mensaje = "Preparado?";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void IngresarLetra(String letra_elegida) {
        for (contador_letra_elejida = 0; contador_letra_elejida < palabra_elejida.length(); contador_letra_elejida++) {
            if (letra_elegida.equals(palabra_elejida.substring(contador_letra_elejida, contador_letra_elejida + 1))) {
                acerto_letra = 1;
                mensaje = "Ha acertado una letra";
                System.out.println(mensaje);
                
            }
        }
        contador_letra_elejida = 0;
        if (acerto_letra == 0) {
            mensaje = "Letra incorrecta";
            System.out.println(mensaje);
            posibilidades = posibilidades - 1;
        }

        acerto_letra = 0;
    }

    public void EjecutarJuego() {
        while (posibilidades > 0) {
            //acerto_letra = 0;
            //System.out.println("Elija una letra");
            //String letra_elejida;
            //letra_elejida = unScanner.nextLine();

            //String subcadena=palabra_elejida.substring(2,4);
            //System.out.println(subcadena);
        };
    }
    
    public boolean TerminoElJuego(){
        return posibilidades<=0;
    }
}
