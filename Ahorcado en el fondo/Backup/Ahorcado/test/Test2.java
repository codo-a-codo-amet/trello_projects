/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ahorcado.Controlador.PalabraControlador;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class Test2 {
    private List<String> letrasUsadas;
    PalabraControlador palabraControlador;

    public Test2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        palabraControlador = new PalabraControlador();
            palabraControlador.verificarLetra("A");
            palabraControlador.verificarLetra("C");
            
            
    }
    
    @After
    public void tearDown() {
        palabraControlador = null;
        letrasUsadas = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void verificarLetrasEnPalabra(){
            String[] estaPalabra = {"C","A","S","A"};
            String[] aVerficaar  = palabraControlador.verificarEstaPalabra(estaPalabra);
            String[] deseable = {"C","A","_ ","A"};
            assertArrayEquals(deseable, aVerficaar);
    }
    @Test
    public void convertirAArray(){
        String estaPalabra = "casa";
        String[] aVerificar = palabraControlador.caracterPalabra(estaPalabra);
        String[] Palabra = {"C","A","S","A"};
        assertArrayEquals(Palabra, aVerificar);
    }
    @Test
    public void testearArray(){
        String palabraTest = palabraControlador.entregarGuiones();
               
    }
    @Test
    public void testRandom(){
        for (int i = 0; i < 10; i++) {
            int valor = palabraControlador.RandomPalabra();
            System.out.println("El valor es " + valor);
        }
    }
    
    @Test
    public void testearPalabritas(){
        System.out.println("Prueba de palabritas");
        for (int i = 0; i < 10; i++) {
            String palabra= palabraControlador.getComprobarRandomPalabra().getPalabra();
            System.out.println("Esta palabra es " + palabra);
        }
    }
}
