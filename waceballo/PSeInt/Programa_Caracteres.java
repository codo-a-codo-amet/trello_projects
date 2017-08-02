/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "LEERCARACTERES.java."

import java.io.*;

public class leercaracteres {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellido;
		double longitud{nombre};
		int m;
		String nombre;
		String nombre_completo;
		int p;
		String primer_nombre;
		int x;
		System.out.println("Ingrese Nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Ingrese Apellido");
		apellido = bufEntrada.readLine();
		nombre_completo = nombre.concat(" ");
		nombre_completo = nombre_completo.concat(apellido);
		System.out.println("La longitud de tu nombre completo es "+nombre_completo.length());
		primer_nombre = nombre_completo.substring(0,nombre.length()+1);
		System.out.println("Tu primer nombre extraido de la cadena completa es "+primer_nombre);
		System.out.println("La longitud de tu nombre es "+nombre.length());
		System.out.println("Opcion Para");
		for (x=0;x<=nombre.length()-1;x++) {
			System.out.println("La letra para la posicion "+x+" es "+nombre.substring(x,x+1).toUpperCase());
		}
		System.out.println("Opcion Mientras");
		p = 0;
		while (nombre.length()>p) {
			System.out.println("La letra para la posicion "+p+" es "+nombre.substring(p,p+1).toUpperCase());
			p = p+1;
		}
		System.out.println("Opcion Repetir");
		m = 0;
		do {
			System.out.println("La letra para la posicion "+m+" es "+nombre.substring(m,m+1).toUpperCase());
			m = m+1;
		} while (m<=nombre.length()-1);
	}


}

