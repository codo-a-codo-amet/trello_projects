/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROGRAMA_LISTA_ALUMNOS.java."

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

public class programa_lista_alumnos {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	// Ingresa el listado de alumnos
	public static void ingresoalumnos(SIN_TIPO lista_alumnos, int cantidad_alumnos) throws IOException {
		int alumnos_ingresados;
		String apellido_alumno;
		String lista_alumno[];
		String lista_apellido[];
		String nombre_alumno;
		lista_alumno = new String[cantidad_alumnos];
		lista_apellido = new String[cantidad_alumnos];
		alumnos_ingresados = 0;
		do {
			System.out.println("Ingrese el nombre del alumno N° "+alumnos_ingresados+1);
			nombre_alumno = bufEntrada.readLine();
			System.out.println("Ingrese apellido del alumno");
			apellido_alumno = bufEntrada.readLine();
			lista_alumno[alumnos_ingresados-1] = nombre_alumno;
			lista_apellido[alumnos_ingresados-1] = apellido_alumno;
			alumnos_ingresados = alumnos_ingresados+1;
		} while (alumnos_ingresados<cantidad_alumnos);
	}

	// Imprimi el listado de alumnos
	public static void imprimiralumnos(String lista_alumno[], String lista_apellido[], double cantidad_alumnos) {
		double paso;
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("La Lista completa de Alumnos es");
		System.out.println("*******************************");
		System.out.println("Nombre  |  Apellido");
		System.out.println("*******************************");
		paso = 0;
		do {
			System.out.println(lista_alumno[paso-1]+"  |  "+lista_apellido[paso-1]);
			paso = paso+1;
		} while (paso!=cantidad_alumnos);
	}

	public static void main(String args[]) throws IOException {
		int cantidad_alumnos;
		String lista_alumno[];
		String lista_apellido[];
		System.out.println("Ingrese la cantidad de alumnos");
		cantidad_alumnos = Integer.parseInt(bufEntrada.readLine());
		lista_alumno = new String[cantidad_alumnos];
		lista_apellido = new String[cantidad_alumnos];
		ingresoalumnos(lista_alumno,cantidad_alumnos);
		imprimiralumnos(lista_alumno,lista_apellido,cantidad_alumnos);
	}


}

