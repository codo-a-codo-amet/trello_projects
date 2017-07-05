/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Clase28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese la cantidad personas");
        Scanner unScanner = new Scanner(System.in);
        int cantidad_de_personas = unScanner.nextInt();
        
        List<Persona> una_lista_de_personas = new ArrayList();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            una_lista_de_personas.add(new Persona());
        }
        
    }
    
}
