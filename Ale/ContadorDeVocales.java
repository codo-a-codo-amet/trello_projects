/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */
// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CONTADORDEVOCALES.java."
import java.io.*;
public class ContadorDeVocales {
    public static void main(String args[]) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String cadena_ingresada;
        String cadena_mayus;
        int contador;
        int vocales;
        cadena_ingresada = "";
        cadena_mayus = "";
        System.out.println("Por favor ingrese la frase que desea revisar");
        cadena_ingresada = bufEntrada.readLine();
        cadena_mayus = cadena_ingresada.toUpperCase();
        contador = 0;
        vocales = 0;
        do {
            if ( (cadena_mayus.charAt(contador) == 'A') 
                    || (cadena_mayus.charAt(contador) == 'E')
                    || (cadena_mayus.charAt(contador) == 'I') 
                    || (cadena_mayus.charAt(contador) == 'O')  
                    || (cadena_mayus.charAt(contador) == 'U') ) {
                vocales = vocales+1;
            }
            contador = contador+1;
        } while (contador!=cadena_ingresada.length());
        System.out.println("La frase ingresada tiene "+vocales+" vocales");
    }
}