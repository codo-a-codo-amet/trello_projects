/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "HASHTAG.java."

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

public class hashtag {

	public static void presentacion() {
		System.out.println("--------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Listado:");
		System.out.println(" ");
	}

	// ---------------------------------------------------------------------
	public static void descomponer2(String dato) {
		double contador;
		double encontrepalabra;
		int finalpalabra;
		int iniciopalabra;
		int largocadena;
		String letrafinal;
		String letras;
		String palabra;
		int x;
		System.out.println("Otro modo de descomponer(otra funcion):");
		System.out.println(" ");
		// Conozco el largo de la cadena 
		largocadena = dato.length();
		x = 0;
		iniciopalabra = 0;
		finalpalabra = 0;
		encontrepalabra = 0;
		contador = 1;
		do {
			palabra = "";
			letras = dato.substring(x,x+1);
			// Si la letra es #
			if ((letras.equals("#"))) {
				// Selecciono el valor de x como inicio
				iniciopalabra = x;
				do {
					x = x+1;
					letras = dato.substring(x,x+1);
					// Si la letra no es # se agrega
					if ((!letras.equals("#")&(x<largocadena))) {
						// Si la letra es # 
					} else {
						// Marca el final de la palabra
						finalpalabra = x-1;
						letrafinal = dato.substring(finalpalabra,finalpalabra+1);
						// Si la ultima letra de lo marcado es espacio o coma, la quito
						if (((letrafinal.equals(" ")) || (letrafinal.equals(",")))) {
							finalpalabra = finalpalabra-1;
						}
						palabra = dato.substring(iniciopalabra,finalpalabra+1);
						System.out.println(contador+" "+palabra);
						contador = contador+1;
						encontrepalabra = 1;
						x = x-1;
					}
				} while (encontrepalabra!=1);
				encontrepalabra = 0;
			}
			x = x+1;
		} while (x<largocadena);
	}

	// ---------------------------------------------------------------------
	public static void descomponer(String dato) {
		double contador;
		int largocadena;
		String letras;
		String palabra;
		int x;
		// Conozco el largo de la cadena 
		largocadena = dato.length();
		x = 0;
		contador = 1;
		do {
			palabra = "";
			letras = dato.substring(x,x+1);
			// Comienzo a separar la palabra que comienza con #
			if ((letras.equals("#"))) {
				palabra = palabra.concat(letras);
				// agrego las letras que siguen del #
				do {
					x = x+1;
					letras = dato.substring(x,x+1);
					// Si no es espacio, coma o # lo tomo como caracter valido
					if (((letras.equals(" ")) || (letras.equals(",")) || (letras.equals("#")) || (x>=largocadena))) {
						// no hago nada dado que en pseint no me toma el valor DISTINTO o sea !=
					} else {
						palabra = palabra.concat(letras);
					}
				} while (!((letras.equals("#")) || (letras.equals(" ")) || (letras.equals(",")) || (x>=largocadena)));
				// Si no tienen separacion, necesito voler el cursor atras
				if ((letras.equals("#"))) {
					x = x-1;
				}
				System.out.println((contador)+" "+palabra);
				contador = contador+1;
			}
			x = x+1;
		} while ((x)<largocadena);
	}

	public static void main(String args[]) {
		String texto;
		// Dado que Pseint no esta preparado para leer y guardar archivos, 
		// el proceso se ejecutara solo con una cadena de texto que incluya
		// los valores a detectar.
		texto = "Listado de etiquetas #hashtag,#nada,#prueba,#pseint,#programar,#separadoporComa #Fiesta #funciona #completo #separadoporEspacio #nadaquever#nunca#niego#sinSeparacion";
		System.out.println("Demostracion de descomposicion de cadenas segun Hashtag");
		System.out.println("El texto de ejemplo que se procesa es:");
		System.out.println(texto);
		presentacion();
		descomponer(texto);
		presentacion();
		descomponer2(texto);
	}


}

