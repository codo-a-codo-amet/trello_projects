import java.io.*;

public class Programa_ContarVocales {

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

