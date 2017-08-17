/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Controlador;

import ahorcado.Diccionario.Diccionario;
import ahorcado.Modelo.Palabra;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author TheGuru
 */
public class PalabraControlador implements IPalabraControlador {

    //private List<Palabra> listadoPalabras;
    private String[] palabritas = {"Estancia", "desarrollo", "alquiler", "Dueño", "Lider", "Ingenio", "insecto", "politica", "ajedrez", "aprobar"};
    private List<String> letrasUsadas;
    private int juego = 1;
    private boolean estaLaLetra = false;
    private int totalLetras = 0;
    private String palabrajuego;
    String[] laPalabraArray;
    private int contadorLetras = 0;
    DefaultListModel palabrasCorrectas;
    Palabra estaPalabra;
    Diccionario diccionario;

    public PalabraControlador() {
        diccionario = new Diccionario();
    //    listadoPalabras = new ArrayList();
        letrasUsadas = new ArrayList();
    //    for (int i = 0; i < palabritas.length; i++) {
    //        listadoPalabras.add(new Palabra(palabritas[i], false));
    //    }
        estaPalabra = getComprobarRandomPalabra();
        palabrajuego = estaPalabra.getPalabra();
        laPalabraArray = caracterPalabra(palabrajuego);
        palabrasCorrectas = new DefaultListModel();
    }

    public Palabra getEstaPalabra() {
        return estaPalabra;
    }

    public String getPalabrajuego() {
        return palabrajuego;
    }

    public void resetearJuego() {
        juego = 1;
        estaLaLetra = false;
        totalLetras = 0;
        contadorLetras = 0;
        letrasUsadas.clear();
    }

    public boolean ganaste() {
        boolean ganaste = false;
        if (contadorLetras == laPalabraArray.length) {
            ganaste = true;
            System.out.println("GANASTE!!!!");
        }
        return ganaste;
    }

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

    public String[] verificarEstaPalabra(String[] palabrita) {
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
    
    public Palabra getComprobarRandomPalabra(){
        Palabra laPalabra;
                  
        int salida = 0;    
        do { 
        laPalabra = diccionario.EntregarDiccionario().get(RandomPalabra());
        
            if (laPalabra.isUsada()) {
              salida++;  
            }
        
        
           
            
        } while (salida > 0);
        
     return laPalabra;  
    }
    
    private int RandomPalabra(){
       
        int d = 1;
        int h = diccionario.EntregarDiccionario().size();
                               
        return (int)(Math.random()*(h - d))+d;
    }

    public int getJuego() {
        return juego;
    }
    public String entregarPalabraAlPerder() {
        
        String laPalabra = Arrays.toString(laPalabraArray).replaceAll("\\[|\\]|,|", "");
        return laPalabra;
    }
     
    public void llenarPalabrasCorrectas(Palabra palabra,JList list){
        this.palabrasCorrectas.addElement(palabra);
        list.setModel(palabrasCorrectas);
        
    }
    public void limpiarPalabrasCorrectas(){
        palabrasCorrectas.removeAllElements();
    }
}
