package longitudpromedio;

import javax.swing.JOptionPane;

public class LongitudPromedio {
    
    public static void main(String[] args) {
         String texto = "El método replace(char oldChar, char newChar). Este método busca todos los caracteres que coincidan con el parámetro oldChar y los sustituye por el carácter que tenga en newChar.\n" +
"El método split sirve para dividir un string en substrings mediante una expresión, split recibirá como parámetro un carácter o grupo de caracteres que usará como patrón a la hora de dividir la cadena.\n" +
"Ejemplo: cadena.split(\",\")";
         
        //System.out.println("La longitud promedio de las palabras es " + calcularLongitudPromedio(texto) );
        imprimir(texto);
    }
    
    static double calcularLongitudPromedio (String cadena)
    {
        String aux = limpiarCadena(cadena);
                String[] palabras = aux.split(" ");
        int acumulador = 0;
        for (int i = 0; i < palabras.length; i++) 
        {
            acumulador += palabras[i].length(); //Acumulamos la cantidad de caracteres de cada palabra
        }
        return (double) acumulador / palabras.length; //Devolvemos la cantidad de letras de la cadena / la cantidad de palabras
    }
    
    static String limpiarCadena (String cadena)
    {
        // ESTA FUNCION QUITA TODO LO QUE NO SEAN LETRAS (COMAS, PUNTOS, ETC)

        cadena = cadena.replace(".", " "); // Quita los puntos
        cadena = cadena.replace(",", ""); // Quita las comas
        cadena = cadena.replace("(", " "); // Quita los paréntesis de apertura
        cadena = cadena.replace(")", ""); // Quita los paréntesis de clausura
        cadena = cadena.replace(":", ""); // Quita los dos puntos
        cadena = cadena.replace("\"","");
        return cadena;
    }
    
    static void imprimir(String cadena){
    JOptionPane.showMessageDialog(null, "La longitud promedio de las palabras es " + calcularLongitudPromedio (cadena), "Informacion", -1);
    }
}
