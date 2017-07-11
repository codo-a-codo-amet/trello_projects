/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MES_CALENDARIO.java."

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

public class mes_calendario {

	public static String calendario(int nummes) {
		String valormes;
		switch (nummes) {
		case 1:
			valormes = "Enero";
			break;
		case 2:
			valormes = "Febrero";
			break;
		case 3:
			valormes = "Marzo";
			break;
		case 4:
			valormes = "Abril";
			break;
		case 5:
			valormes = "Mayo";
			break;
		case 6:
			valormes = "Junio";
			break;
		case 7:
			valormes = "Julio";
			break;
		case 8:
			valormes = "Agosto";
			break;
		case 9:
			valormes = "Septiembre";
			break;
		case 10:
			valormes = "Octubre";
			break;
		case 11:
			valormes = "Noviembre";
			break;
		case 12:
			valormes = "Diciembre";
			break;
		default:
			valormes = "Inexistente";
		}
		return valormes;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nummes;
		String valormes;
		do {
			System.out.println("Ingrese un numero de mes");
			nummes = bufEntrada.readLine();
			valormes = calendario(nummes);
			System.out.println("El mes es "+valormes);
		} while (valormes.equals("Inexistente"));
	}


}

