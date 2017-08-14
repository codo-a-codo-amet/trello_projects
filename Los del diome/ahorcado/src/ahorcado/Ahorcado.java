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

}

                
                
