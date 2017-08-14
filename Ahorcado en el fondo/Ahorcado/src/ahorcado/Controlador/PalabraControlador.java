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
    private String[] palabritas = {"Estancia", "desarrollo", "alquiler", "Dueño", "Lider", "Ingenio", "insecto", "politica", "ajedrez", "aprobar"};
    private List<String> letrasUsadas;
<<<<<<< HEAD
    
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

=======
    private int juego = 1;
    private boolean estaLaLetra = false;
    private int totalLetras = 0;
    private String palabrajuego;
    String[] laPalabraArray;
    private int contadorLetras = 0;

    public PalabraControlador() {
        listadoPalabras = new ArrayList();
        letrasUsadas = new ArrayList();
        for (int i = 0; i < palabritas.length; i++) {
            listadoPalabras.add(new Palabra(palabritas[i], false));
        }
        palabrajuego = listadoPalabras.get(1).getPalabra();
        laPalabraArray = caracterPalabra(palabrajuego);
    }

    public void resetearJuego() {
        juego = 1;
        estaLaLetra = false;
        totalLetras = 0;
        contadorLetras = 0;
    }

    public boolean ganaste() {
        boolean ganaste = false;
        if (contadorLetras == laPalabraArray.length) {
            ganaste = true;
            System.out.println("GANASTE!!!!");
>>>>>>> 299e3479ed648515d06c9e8a9e34e9b217fcec5d
        }
        return ganaste;
    }
<<<<<<< HEAD
        
    

    public PalabraControlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
=======

>>>>>>> 299e3479ed648515d06c9e8a9e34e9b217fcec5d
    @Override
    public void verificarLetra(String letra) {
        letrasUsadas.add(letra);
        for (int i = 0; i < laPalabraArray.length; i++) {
            if (laPalabraArray[i].equals(letra)) {
                estaLaLetra = true;
                System.out.println("Esta la letra " + letra);
                contadorLetras++;
            }
        }
        if (estaLaLetra == false) {
            juego++;
            System.out.println("Juego " + juego);
        }
        estaLaLetra = false;
    }

    public String entregarGuionesPrimeraVez() {
        String[] palabraVerificada = new String[laPalabraArray.length];
        for (int j = 0; j < laPalabraArray.length; j++) {
            palabraVerificada[j] = "_ ";
        }
        String guiones = Arrays.toString(palabraVerificada).replaceAll("\\[|\\]|,|", "");
        return guiones;
    }

    @Override
    public String entregarGuiones() {
        String[] laPalabraArrayGuion = verificarEstaPalabra(laPalabraArray);
        String guiones = Arrays.toString(laPalabraArrayGuion).replaceAll("\\[|\\]|,|", "");
        return guiones;
    }
<<<<<<< HEAD
    
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
=======

    public String[] verificarEstaPalabra(String[] palabrita) {
>>>>>>> 299e3479ed648515d06c9e8a9e34e9b217fcec5d
        String[] palabraVerificada = new String[palabrita.length];
        for (int i = 0; i < letrasUsadas.size(); i++) {
            totalLetras = letrasUsadas.size() * palabrita.length;
            for (int j = 0; j < palabrita.length; j++) {
                if (letrasUsadas.get(i).equals(palabrita[j])) {
                    palabraVerificada[j] = letrasUsadas.get(i);
                } else {
                    if ((palabraVerificada[j] == null) || (palabraVerificada[j] == "_ ")) {
                        palabraVerificada[j] = "_ ";
                    }
                }
            }
        }
        return palabraVerificada;
    }
<<<<<<< HEAD
>>>>>>> 1fe1fa96e2939cf5cdda63fb3203fbc9eac0ea15
=======

    @Override
    public String[] caracterPalabra(String palabra) {
        String[] laLetra;
        laLetra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            String soloLetra = palabra.substring(i, i + 1);
            laLetra[i] = soloLetra.toUpperCase();

        }
        return laLetra;
    }

    public int getJuego() {
        return juego;
    }

>>>>>>> 299e3479ed648515d06c9e8a9e34e9b217fcec5d
}

    
