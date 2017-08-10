/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Controlador;

import ahorcado.Modelo.Palabra;
import java.util.*;

/**
 *
 * @author TheGuru
 */
public class PalabraControlador implements IPalabraControlador {

    private List<Palabra> listadoPalabras;
    private String[] palabritas= {"Estancia","desarrollo","alquiler","Dueño","Lider","Ingenio","insecto","politica","ajedrez","aprobar"};
    private List<String> letrasUsadas;
    public PalabraControlador (){
        listadoPalabras = new ArrayList();
        letrasUsadas = new ArrayList();
        for (int i = 0; i < palabritas.length; i++) {
            listadoPalabras.add(new Palabra(palabritas[i],false));
        }
    }
    
    
    
    
    @Override
    public void verificarLetra(String letra) {
        letrasUsadas.add(letra);
        System.out.println("Verificando la letra "+ letra);
    }

    @Override
    public void entregarGuiones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public String[] caracterPalabra (String palabra){
        
       String [] laLetra;
        laLetra = new String [palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            String soloLetra = palabra.substring(i, i+1);
            laLetra[i] = soloLetra.toUpperCase();
            
            
        }
        return laLetra;
      }
}
