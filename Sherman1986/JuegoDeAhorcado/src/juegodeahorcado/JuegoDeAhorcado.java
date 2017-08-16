<<<<<<< HEAD:Los del diome/ahorcado/src/ahorcado/Ahorcado.java
package ahorcado;

public class Ahorcado {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.imprimir();
        Jugador jugador = new Jugador();
        boolean ganador = false;

        for (int i = 1; i <= tablero.getCantidadElementos() * 2; i++) {
            String letra = jugador.pedirLetra();
            tablero.verificar(letra);
            tablero.imprimir();
            if (tablero.verificarGanador()) {
                ganador = true;
                 break;
            }
        }
        if (ganador) {
            System.out.println("HAZ GANADO!!!");
            
        }else{
            System.out.println("VUELVE A INTENTARLO!!!");
        }
    }

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeahorcado;

import java.util.*;

/**
 *
 * @author power
 */
public class JuegoDeAhorcado {

    public static void main(String[] args) {
        Controlador unControlador  = new Controlador();
        
        unControlador.Run();
    }
>>>>>>> ff007b05e4b94fe28bfb74dd0e787a1ca4cfbe4a:Sherman1986/JuegoDeAhorcado/src/juegodeahorcado/JuegoDeAhorcado.java
}

                
                
