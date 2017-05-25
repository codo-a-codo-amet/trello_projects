/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CONTAR_VOCALES2.java."

import java.io.*;

public class contar_vocales2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador_vocales;
		String las_vocales;
		int longi_palabra;
		int longi_vocal;
		String palabra;
		String vocales;
		String vocal_palabra;
		int xx;
		int yy;
		vocales = "aeiouAEIOU";
		longi_vocal = vocales.length();
		System.out.println("Ingrese una palabra");
		palabra = bufEntrada.readLine();
		longi_palabra = palabra.length();
		contador_vocales = 0;
		for (xx=1;xx<=longi_palabra;xx++) {
			vocal_palabra = palabra.substring(xx-1,xx);
			for (yy=1;yy<=longi_vocal;yy++) {
				las_vocales = vocales.substring(yy-1,yy);
				if (vocal_palabra.equals(las_vocales)) {
					contador_vocales = contador_vocales+1;
				}
			}
		}
		System.out.println("La palabra tiene "+contador_vocales+" vocales");
	}


}

