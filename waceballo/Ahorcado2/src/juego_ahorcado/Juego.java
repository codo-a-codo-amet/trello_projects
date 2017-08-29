/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego_Ahorcado;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import modelo.Palabras;

/**
 *
 * @author alumno
 */
public class Juego {

    Scanner unScanner = new Scanner(System.in);
    String[] listado_de_palabras = {"JAVA", "CASA", "LLAVE", "AUTO", "PERRO"};
    int numero_al_azar = 1 + new Random().nextInt(5);
    private List<String> palabra;
    int posibilidades = 6;
    int letra_contador = 0;
    int contador_letra_elejida=0;
    //String palabra_elejida = listado_de_palabras[numero_al_azar];
    Palabras palabra_elejida;
    int acerto_letra = 0;

    public Juego(){
        palabra_elejida = new Palabras();
    }

    public void EjecutarJuego() {
        String palabra = palabra_elejida.MostrarPalabra();
        int largoPalabra = palabra.length();
        System.out.println(palabra);
        
        while (posibilidades > 0) {
            acerto_letra=0;
            System.out.println("Elija una letra");
            String letra_elejida;
            letra_elejida = unScanner.nextLine();
               for(contador_letra_elejida=0;contador_letra_elejida<palabra.length();contador_letra_elejida++){
               if(letra_elejida.equals(palabra.substring(contador_letra_elejida,contador_letra_elejida+1))){
               acerto_letra = 1;
               System.out.println("Ha acertado una letra");
              }
      } 
               contador_letra_elejida=0;
               if(acerto_letra==0){
                   System.out.println("Letra incorrecta");
               posibilidades=posibilidades-1;
        }
    }   
  }      
}
