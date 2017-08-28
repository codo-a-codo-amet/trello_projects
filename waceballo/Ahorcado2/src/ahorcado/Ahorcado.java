/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author walterc
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
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

        } else {
            System.out.println("VUELVE A INTENTARLO!!!");
        }
    }

}
