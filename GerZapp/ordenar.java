/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;

public class ordenar {

	public static int aleatorio_pseint(double min, double max) {
		int numero_aleatorio;
		numero_aleatorio = Math.floor(min+(random()*(max-min)));
		// -------------------------------
		// Min                            Max
		return numero_aleatorio;
	}


public class ordenar {

	public static void main(String args[]) {
		int contador;
		int elementos;
		int lista_a_ordenar[];
		int prueba;
		String temporal;
		int valor_aleatorio;
		elementos = aleatorio(3,10);
		lista_a_ordenar = new int[elementos];
		System.out.println("La lista a ordenar es: ");
		contador = 0;
		do {
			valor_aleatorio = aleatorio(-1000,1000);
			lista_a_ordenar[contador] = valor_aleatorio;
			contador = contador+1;
			System.out.println(valor_aleatorio);
		} while (contador<elementos);
		prueba = 0;
		do {
			contador = prueba;
			do {
				if (lista_a_ordenar[prueba]>lista_a_ordenar[contador+1]) {
					temporal = lista_a_ordenar[prueba];
					lista_a_ordenar[prueba] = lista_a_ordenar[contador+1];
					lista_a_ordenar[contador+1] = temporal;
				}
				contador = contador+1;
			} while (contador<elementos-1);
			prueba = prueba+1;
		} while (prueba<elementos-1);
		System.out.println("");
		System.out.println("La lista ordenada es: ");
		contador = 0;
		do {
			System.out.println(lista_a_ordenar[contador]);
			contador = contador+1;
		} while (contador<elementos);
	}


}
