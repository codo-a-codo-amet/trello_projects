/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wceba
 */
public class Palabras {

    private String letra;
    private String palabra;
    private List<String> PalabraArmar;

    public Palabras() {
        PalabraArmar = new ArrayList<>();
    }

    public List<String> GuardarLetra(String letra) {
        PalabraArmar.add(letra);

        return PalabraArmar;
    }
<<<<<<< HEAD

    public String ArmarPalabra(List<String> lista) {
=======
    
//    public void setGuardarLetra(String palabra, String letra){
//        int contador = palabra.length();
//        char[] AlgunaLetra = new char[contador];
//        
//        for (int i = 0; i < contador; i++) {
//            AlgunaLetra[i]=letra;
//            System.out.println("letras "+AlgunaLetra[i]);
//        }
//       
//    }
    
    public String ArmarPalabra(List<String> lista){
>>>>>>> 67d113708a61221c4eb414c748b648d08c5c9e28
        String pa = "";

        for (int i = 0; i < lista.size(); i++) {
            pa = lista.get(i);
        }

        return pa;
    }

    public String getMostrarPalabra() {
        for (int i = 0; i < PalabraArmar.size(); i++) {
            palabra = PalabraArmar.get(i);
        }
        return palabra;
    }
}
