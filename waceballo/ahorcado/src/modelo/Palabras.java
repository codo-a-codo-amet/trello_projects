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
    
    public Palabras(){
        PalabraArmar = new ArrayList<>();
    }
    
    public List<String> GuardarLetra(String letra){
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
    
    public String getMostrarPalabra(){
        for (int i = 0; i < PalabraArmar.size(); i++) {
            palabra = PalabraArmar.get(i);
        }
        return palabra;
    }
}
