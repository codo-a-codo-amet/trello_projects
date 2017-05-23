/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromasbajo;

/**
 *
 * @author alumno
 */
public class Numeromasbajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
		int elementos;
		int lista_a_ordenar[];
		double numeromasbajo;
		int valor_aleatorio;
		elementos = enteroRandom(3,10);
		lista_a_ordenar = new int[elementos];
		contador = 1;
		numeromasbajo = 1000;
		do {
			valor_aleatorio = enteroRandom(-1000,1000);
			lista_a_ordenar[contador] = valor_aleatorio;
			contador = contador+1;
			System.out.println("orden"+valor_aleatorio);
		} while (contador<elementos);
		contador = 1;
		do {
			if ((numeromasbajo>=lista_a_ordenar[contador])) {
				numeromasbajo = lista_a_ordenar[contador];
			}
			contador = contador+1;
		} while (contador<elementos);
		System.out.println("El numero mas bajo es "+numeromasbajo);
	}
    private static int enteroRandom(int h, int d) {
        return (int) (Math.random() * (h - d + 1) + d);
    }
    }
    

