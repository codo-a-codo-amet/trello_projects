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
    String[] listado_de_palabras = {"Java", "Casa", "Llave", "Auto", "Perro"};
    int numero_al_azar = 1 + new Random().nextInt(5);
    private List<String> palabra;
    int posibilidades = 6;
    int letra_contador = 0;
    String letra = "a";
    String palabra_elejida = listado_de_palabras[numero_al_azar];
    boolean acerto_letra = false;

    public void EjecutarJuego() {
        while (posibilidades > 0) {
            System.out.println("Elija una letra");
            String letra_elejida;
            letra_elejida = unScanner.nextLine();

            if (letra_elejida.equals(letra)) {
                acerto_letra = true;
                System.out.println("Letra correcta");
            } else {
                acerto_letra = false;
                System.out.println("Letra incorrecta");
                posibilidades = posibilidades - 1;
            }
              for (int i = 0; i < palabra_elejida.length(); i++) {

        }
        }
        
    }
}
