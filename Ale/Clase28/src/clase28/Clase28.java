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
        System.out.println("Ingrese la cantidad personas");
        Scanner unScanner = new Scanner(System.in);
        int cantidad_de_personas = unScanner.nextInt();
        
        List<Persona> una_lista_de_personas = new ArrayList();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            
            System.out.println("Ingrese el nombre de la persona");
            String unNombre = unScanner.next();
            
            System.out.println("Ingrese el apellido de la persona");
            String unApellido = unScanner.next();
            
            una_lista_de_personas.add(new Persona(unNombre,unApellido));
        }
        
        System.out.println("La lista de personas es: " + una_lista_de_personas);
        
        
        System.out.println("Ingrese el nombre de la persona a buscar");
        String nombre_a_buscar = unScanner.next();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            
            Persona unaPersona = una_lista_de_personas.get(i);
            String nombre_de_persona = unaPersona.getNombre();
           
            if ( nombre_de_persona.equalsIgnoreCase(nombre_a_buscar)){
                System.out.println("Encontre a la persona");
            }
        
        }
    }
    
}
