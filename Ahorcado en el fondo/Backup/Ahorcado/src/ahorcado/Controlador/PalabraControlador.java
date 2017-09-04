/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Controlador;

import ahorcado.Diccionario.Diccionario;
import ahorcado.Modelo.Palabra;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author TheGuru
 */
public class PalabraControlador implements IPalabraControlador, IKeyGameListener{

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
   

    public PalabraControlador() { //Constructor
        diccionario = new Diccionario();
        letrasUsadas = new ArrayList();
        palabrasCorrectas = new DefaultListModel();
        
        preparaJuego();
    }
    

    public void resetearJuego() { //Lleva los parametros al valor default
        juego = 1;
        estaLaLetra = false;
        totalLetras = 0;
        contadorLetras = 0;
        letrasUsadas.clear();
    }

    public boolean ganaste() { //Verifica si hay ganador
        boolean ganaste = false;
        if (contadorLetras == laPalabraArray.length) {
            ganaste = true;
            System.out.println("GANASTE!!!!");
        }
        estaPalabra.setUsada(true);
        return ganaste;
    }

    @Override
    public void verificarLetra(String letra) {//Verifica si las letras estan en las palabras
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

    public String entregarGuionesPrimeraVez() {//Pasa la cadena con guiones para el inicio del juego
        String[] palabraVerificada = new String[laPalabraArray.length];
        for (int j = 0; j < laPalabraArray.length; j++) {
            palabraVerificada[j] = "_ ";
        }
        String guiones = Arrays.toString(palabraVerificada).replaceAll("\\[|\\]|,|", "");
        return guiones;
    }

    @Override
    public String entregarGuiones() {//Pasa la cadena con guiones de la palabra
        String[] laPalabraArrayGuion = verificarEstaPalabra(laPalabraArray);
        String guiones = Arrays.toString(laPalabraArrayGuion).replaceAll("\\[|\\]|,|", "");
        return guiones;
    }

    public String[] verificarEstaPalabra(String[] palabrita) { //Reemplaza los guiones por las letras correctas
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
    public String[] caracterPalabra(String palabra) {//convierte una cadena en un array y le quita acentos
        String[] laLetra;
        laLetra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            String soloLetra = palabra.substring(i, i + 1);
            switch(soloLetra){
                case "Á":
                    soloLetra = "A";
                    break;
                case "á":
                    soloLetra = "a";
                    break;
                case "É":
                    soloLetra = "E";
                    break;
                case "é":
                    soloLetra = "e";
                    break;    
                case "Í":
                    soloLetra = "I";
                    break;
                case "í":
                    soloLetra = "i";
                    break;    
                case "Ó":
                    soloLetra = "O";
                    break;
                case "ó":
                    soloLetra = "o";
                    break;    
                case "Ú":
                    soloLetra = "U";
                    break;
                case "ú":
                    soloLetra = "u";
                    break;    
            }
            laLetra[i] = soloLetra.toUpperCase();

        }
        return laLetra;
    }
    
    public Palabra getComprobarRandomPalabra(){//elije la palabra para jugar y verifica si ya esta usada
        Palabra laPalabra=null;
                  
        int salida = 0;    
        do { 
        laPalabra = diccionario.EntregarDiccionario().get(RandomPalabra());
        
            if (laPalabra.isUsada()) {
              salida++;  
            }
            
        } while (salida > 0);
        System.out.println("Palabra elegida " + laPalabra);
     return laPalabra;  
    }
    
    public int RandomPalabra(){//elije un numero al azar para tomar la palabra a usar
       
        int d = 1;
        int h = diccionario.EntregarDiccionario().size();
                               
        return (int)(Math.random()*(h - d)+d);
    }

    
    public String entregarPalabraAlPerder() {//cuando pierde muestra en la vista la palabra
        
        String laPalabra = Arrays.toString(laPalabraArray).replaceAll("\\[|\\]|,|", "");
        return laPalabra;
    }
     
    public void llenarPalabrasCorrectas(Palabra palabra,JList list){//carga en una lista la palabra completada
        this.palabrasCorrectas.addElement(palabra);
        list.setModel(palabrasCorrectas);
        
    }
    public void limpiarPalabrasCorrectas(){//borra la lista de palabras completadas
        palabrasCorrectas.removeAllElements();
    }

    public void preparaJuego() {//selecciona la palabra a usar para el juego
        estaPalabra = getComprobarRandomPalabra();
        palabrajuego = estaPalabra.getPalabra();
        laPalabraArray = caracterPalabra(palabrajuego);
    }
    public Palabra getEstaPalabra() {//devuelve palabra del juego
        return estaPalabra;
    }

    public String getPalabrajuego() {//devuelve la cadena del objeto Palabra
        return palabrajuego;
    }
    public int getJuego() {// devuelve la cantidad de letras utilizadas-- inicializado en 1
        return juego;
    }

    @Override
    public void listen(Event event) {
        KeyEvent e =(KeyEvent)event.target;
            System.out.println("Llego a Game: " + e.getKeyChar());
    }
}
