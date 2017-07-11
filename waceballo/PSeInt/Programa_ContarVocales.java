/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONTARVOCALES.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class contarvocales {

	public static double contar_vocales(String texto_completo) {
		double contador;
		int indice;
		int longitud_del_texto;
		String un_caracter;
		contador = 0;
		indice = 0;
		longitud_del_texto = texto_completo.length();
		do {
			un_caracter = texto_completo.substring(indice,indice+1);
			if (una_vocal(un_caracter)) {
				contador = contador+1;
			}
			indice = indice+1;
		} while (indice<longitud_del_texto);
		return contador;
	}

	public static boolean una_vocal(String letra) {
		boolean es_vocal;
		es_vocal = false;
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			es_vocal = true;
		}
		return es_vocal;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num;
		String t;
		String tex;
		System.out.println("----------------------------");
		System.out.println("Ingrese una cadena de texto");
		tex = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("----------------------------");
		System.out.println("La cadena que ud. escribio es: "+tex);
		num = contar_vocales(tex.toLowerCase());
		if (num==1) {
			t = " vocal";
		} else {
			t = " vocales";
		}
		System.out.println("Su cadena tiene "+num+t);
		System.out.println("Su cadena tiene una longitud de "+tex.length());
		System.out.println("----------------------------");
	}


}

