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
    public void hello(){
            String[] estaPalabra = {"C","A","S","A"};
            String[] aVerficaar  = palabraControlador.verificarEstaPalabra(estaPalabra);
     
    }
}
