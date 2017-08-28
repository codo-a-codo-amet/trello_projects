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
    private String Palabra;

    private Archivo archivo = new Archivo();
        

    public Palabras() {
        PalabraArmar = new ArrayList<>();
    }

    private int getIdPalabra(int min, int max){
        return min + ( ( max - min) * (int)(Math.random()*1000)) / 1000;
    }
    
    public String MostrarPalabra(){
        int idPalabra = getIdPalabra(0, archivo.LeerArchivo().size());
    
        Palabra = archivo.LeerArchivo().get(idPalabra);
        
        return Palabra;
    }
    
    public List<String> GuardarLetra(String letra) {
        PalabraArmar.add(letra);

        return PalabraArmar;
    }

    public String ArmarPalabra(List<String> lista){
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
