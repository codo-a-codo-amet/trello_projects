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

    private final List<Palabra> listadoPalabras;
    private final String[] palabritas= {"Estancia","desarrollo","alquiler","Dueño","Lider","Ingenio","insecto","politica","ajedrez","aprobar"};
    private final List<String> letrasUsadas;
    
    public PalabraControlador (String string){
        listadoPalabras = new ArrayList();
        letrasUsadas = new ArrayList();
        
        
        for (String palabrita : palabritas) {
            listadoPalabras.add(new Palabra(palabrita, false));
    
         //   public void PalabraSeleccionada;{
        
         Random azar = new Random();
        int dato1;
        dato1 = azar.nextInt(palabrita.length());
        int inicio = palabrita.indexOf(" ");
        int fin = palabrita.indexOf(" ",inicio + dato1);
        string = palabrita.substring(inicio + dato1, fin);
        System.out.println(string);

        }
    }
        
    

    public PalabraControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    

    /* if (lista.indexOf(cadena) != -1){
      for (t=0;t< inicio && t>fin; t++){
       l=lista.indexOf(cadena.charAt(t));
       y=lista.charAt(l);
       System.out.println(l);
       System.out.println(y);
      }
      
     }*/
}

    
