/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

import java.util.Random;
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
public class CalculadoraSimpleTest {
    
    public CalculadoraSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of binaryOperation method, of class CalculadoraSimple.
     */
    @Test
    public void testBinaryOperation() {
        System.out.println("binaryOperation");
        Random ran = new Random();
        float element1 = ran.nextFloat() *  10;
        String operation = "+";
        float element2 = ran.nextFloat() *  10;
        CalculadoraSimple instance = new CalculadoraSimple();
        float expResult = element1 + element2;
        instance.setElement(0, element1);
        instance.setElement(1, element2);
        instance.setOperation(operation);
        float result = instance.executeBinaryOpertion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
