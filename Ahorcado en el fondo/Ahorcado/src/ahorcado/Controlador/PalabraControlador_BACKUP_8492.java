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

<<<<<<< HEAD
    private final List<Palabra> listadoPalabras;
    private final String[] palabritas= {"Estancia","desarrollo","alquiler","Dueño","Lider","Ingenio","insecto","politica","ajedrez","aprobar"};
    private final List<String> letrasUsadas;
    
    public PalabraControlador (String string){
=======
    private List<Palabra> listadoPalabras;
    private String[] palabritas= {"Estancia","desarrollo","alquiler","Dueño","Lider","Ingenio","insecto","politica","ajedrez","aprobar"};
    private List<String> letrasUsadas;
    
    public PalabraControlador (){
>>>>>>> 1fe1fa96e2939cf5cdda63fb3203fbc9eac0ea15
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
    
<<<<<<< HEAD

    /* if (lista.indexOf(cadena) != -1){
      for (t=0;t< inicio && t>fin; t++){
       l=lista.indexOf(cadena.charAt(t));
       y=lista.charAt(l);
       System.out.println(l);
       System.out.println(y);
      }
      
     }*/
=======
    public String[] verificarEstaPalabra(String[] palabrita){
        String[] palabraVerificada = new String[palabrita.length];
        for (int i = 0; i < letrasUsadas.size(); i++) {
            for (int j = 0; j < palabrita.length; j++) {
                if (letrasUsadas.get(i).equals(palabrita[j]) ) {
                    palabraVerificada[j]=letrasUsadas.get(i);
                    System.out.println("La palabra contiene "+letrasUsadas.get(i) );
                }else{
                    palabraVerificada[j]="_ ";
                    System.out.println("La palabra no contiene "+letrasUsadas.get(i));
                }
            }
        }
        
        
        return palabraVerificada;
    }
>>>>>>> 1fe1fa96e2939cf5cdda63fb3203fbc9eac0ea15
}

    
