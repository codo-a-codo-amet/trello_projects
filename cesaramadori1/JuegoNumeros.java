/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.de.gestion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int digitosnumeromaximo;
        int intentos;
        int intentosmaximos;
        int intentotextos=0;
        String jugadores[];
        String nombre_jugador="";
        int numeromaximo;
        int opciones;
        int salida;
        int seleccion;
        // Creamos la tabla de jugadores
        jugadores = new String[10];
        // Llamamos a la funcion
        inicializarranking(jugadores);
        // Estado para salir del jugo (off)
        salida = 0;
        intentosmaximos = 4;
        numeromaximo = 1000;
        digitosnumeromaximo = 4;
        do {
            System.out.println("Juego de Numeros");
            System.out.println("----------------");
            System.out.println(" ");
            System.out.println("1. Jugar el juego");
            System.out.println("2. Mostrar Ranking (Aun no funciona correctamente.)");
            System.out.println("3. Opciones");
            System.out.println("4. Salir");
            seleccion = Integer.parseInt(sc.nextLine());
            switch (seleccion) {
                case 1:
                    System.out.println(""); // no hay forma directa de borrar la consola en Java
                    intentos = jugar(intentosmaximos, digitosnumeromaximo, numeromaximo);
                    System.out.println("Ingrese su nombre y presione enter para continuar");
                    if ((intentos > 0)) {
                        nombre_jugador = sc.nextLine();
                        intentotextos = intentos;
                    }
                    jugadores[9] = "    " + (Integer.toString(intentotextos)) + "       " + nombre_jugador;
                    System.out.println(""); // no hay forma directa de borrar la consola en Java
                    break;
                case 2:
                    System.out.println(""); // no hay forma directa de borrar la consola en Java
                    ranking(jugadores);
                    System.out.println(""); // no hay forma directa de borrar la consola en Java
                    break;
                case 3:
                    System.out.println("Opciones del Juego");
                    System.out.println(" ");
                    System.out.println("1. Cantidad de Intentos maximos (Actualmente " + intentosmaximos + " )");
                    System.out.println("2. Numero mayor a buscar (Actualmente " + numeromaximo + " )");
                    opciones = Integer.parseInt(sc.nextLine());
                    switch (opciones) {
                        case 1:
                            System.out.println("Ingrese la cantidad maxima de Intentos");
                            intentosmaximos = Integer.parseInt(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Ingrese el numero maximo a buscar");
                            numeromaximo = Integer.parseInt(sc.nextLine());
                            digitosnumeromaximo = Integer.toString(numeromaximo).length();
                            break;
                        default:
                            System.out.println("La opcion seleccionada no es valida.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por jugar. Vuelva pronto");
                    salida = 1;
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida.");
            }
        } while (salida != 1);
    }

    // Esta funcion convierte los int a string para poder compararlos
    public /*String*/static 
    void numeroscaracteres(int intento, int nrorandom, int digitosnumeromaximo) {
        String carac_intento;
        String carac_random;
        String intentotexto;
        String numerointento;
        String random[];
        String randomtexto;
        int x;
        int z;
        randomtexto = Integer.toString(nrorandom);
        intentotexto = Integer.toString(intento);
        random = new String[digitosnumeromaximo];
		// Imprimir randomtexto , "random Texto", longitud(randomtexto)
        // Imprimir intentotexto, "intento ", longitud(intentotexto)
        x = 0;
        if ((randomtexto.length() < digitosnumeromaximo - 1)) {
            randomtexto = "0" + randomtexto;
        }
        if ((intentotexto.length() < digitosnumeromaximo - 1)) {
            intentotexto = "0" + intentotexto;
        }
        do {
            carac_random = randomtexto.substring(x, x + 1);
            numerointento = "#";
            z = 0;
            do {
                carac_intento = intentotexto.substring(z, z + 1);
                if ((carac_random.equals(carac_intento) && x == z)) {
                    random[x] = carac_random;
                }
                if ((x == 0 && z == 0 && !carac_intento.equals(carac_random))) {
                    random[x] = numerointento;
                }
                if ((x == 1 && z == 1 && !carac_intento.equals(carac_random))) {
                    random[x] = numerointento;
                }
                if ((x == 2 && z == 2 && !carac_intento.equals(carac_random))) {
                    random[x] = numerointento;
                }
                if ((x == 3 && z == 3 && !carac_intento.equals(carac_random))) {
                    random[x] = numerointento;
                }
                if ((x == 4 && z == 4 && !carac_intento.equals(carac_random))) {
                    random[x] = numerointento;
                }
                z = z + 1;
            } while (z != intentotexto.length());
            random[z] = numerointento;
            numerointento = "";
            x = x + 1;
        } while (x != randomtexto.length());
        if ((randomtexto.length() == 2)) {
            System.out.println("[" + random[0] + "]" + "[" + random[1] + "]");
        }
        if ((randomtexto.length() == 3)) {
            System.out.println("[" + random[0] + "]" + "[" + random[1] + "]" + "[" + random[2] + "]");
        }
        if ((randomtexto.length() == 4)) {
            System.out.println("[" + random[0] + "]" + "[" + random[1] + "]" + "[" + random[2] + "]" + "[" + random[3] + "]");
        }
        if ((randomtexto.length() == 5)) {
            System.out.println("[" + random[0] + "]" + "[" + random[1] + "]" + "[" + random[2] + "]" + "[" + random[3] + "]" + "[" + random[4] + "]");
        }
        //return caracter;
    }

    // Funcion para determinar si el numero es mayor o menor al selecionado

    public static void mayor_menor(int intento, int nrorandom, int digitosnumeromaximo) {
        if ((intento > nrorandom)) {
            System.out.println("El numero que buscamos es Menor que " + intento);
        } else {
            System.out.println("El numero que buscamos es Mayor que " + intento);
        }
    }

    // Funcion para determinar si el valor corresponde con el seleccionado

    public static int es_correcto(int intento, int nrorandom, int digitosnumeromaximo) {
        //String entexto;
        int finalizar;
        if ((intento == nrorandom)) {
            System.out.println("Felicitaciones, El numero es correcto!!!!!!!!.");
            finalizar = 1;
        } else {
            // Imprimir "El numero ingresado no es el correcto."
            mayor_menor(intento, nrorandom, digitosnumeromaximo);
            System.out.println("Pista: Los numeros que son correctos son");
            //entexto = numeroscaracteres(intento, nrorandom, digitosnumeromaximo);
            numeroscaracteres(intento, nrorandom, digitosnumeromaximo);
            //System.out.println(entexto);
            finalizar = 0;
        }
        return finalizar;
    }

    // Funcion de inicio del juego

    public static int jugar(int intentosmaximos, int digitosnumeromaximo, int numeromaximo) throws IOException {
        Scanner sc = new Scanner(System.in);
        int finalizar;
        int intento;
        int intentos;
        String nada;
        int nrorandom;
        int tryme ;
        nrorandom = aleatorio(0, numeromaximo);
            intentos = 1;
            finalizar = 0;
            System.out.println("Tenes que adivinar el numero que pense.");
            System.out.println("Está entre 0 y " + numeromaximo);
            do {
                System.out.println("Ingresa el número");
                intento = Integer.parseInt(sc.nextLine());
                System.out.println("Numero de intentos " + intentos);
                if ((nrorandom < numeromaximo - 1 && intento < numeromaximo - 1)) {
                    finalizar = es_correcto(intento, nrorandom, digitosnumeromaximo);
                } else {
                    finalizar = 2;
                    System.out.println("El numero ingresado es mayor a " + (numeromaximo - 1));
                    System.out.println("Intentalo nuevamente");
                    intentos = intentos - 1;
                }
                intentos = intentos + 1;
            } while (!(intentos == intentosmaximos + 1 || finalizar == 1));
            if ((finalizar == 1)) {
                tryme 
                     = intentos;
                }else {
                            System.out.println("El numero buscado era " + nrorandom);
                            System.out.println("Presione enter para continuar");
                            nada = sc.nextLine();
                            tryme 
                                 = 0;
                            }
                            return tryme ;
                            }
    // Funcion para ordenar y mostrar el ranking de jugadores
    public static void ranking(String jugadores[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String aux;
        int cant;
        int i;
        int j;
        String nada;
        int pos_menor;
        int x;
        System.out.println("Ranking de Jugadores");
        System.out.println(" ");
        System.out.println("_____________________________");
        System.out.println("|Intentos|Nombre del Jugador|");
        System.out.println("_____________________________");
        for (i = 0; i <= 8; i++) {
            // busca el menor entre i y cant
            pos_menor = i;
            /*for (j = i + 1; j <= cant; j++) {
                if (jugadores[j] < jugadores[pos_menor]) {
                    pos_menor = j;
                }
            }*/
            // intercambia el que estaba en i con el menor que encontro
            aux = jugadores[i];
            jugadores[i] = jugadores[pos_menor];
            jugadores[pos_menor] = aux;
        }
        for (x = 0; x <= 9; x++) {
            System.out.println(jugadores[x]);
        }
        System.out.println("Presione enter para continuar");
        nada = sc.nextLine();
    }

    // Inicializa la tabla de ranking al inicio del juego
    public static void inicializarranking(String jugadores[]) {
        int x;
        for (x = 0; x <= 9; x++) {
            jugadores[x] = "  100       Vacio";
        }
    }

    public static int aleatorio(int d, int h) {
        return (int) (Math.random()*(h-d+1)+d);
        //return (Math.random() * (h - d + 1) + d);
    }
}
