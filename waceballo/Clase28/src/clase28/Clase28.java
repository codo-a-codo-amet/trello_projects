/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

import java.util.*;

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
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de personas");
        int cantidad_de_personas = teclado.nextInt();
        
        List<Persona> una_lista_personas = new ArrayList<>();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            System.out.println("Ingrese un nombre");
            String nombre = teclado.next();
            
            System.out.println("Ingres un apellido");
            String apellido = teclado.next();
            
            una_lista_personas.add(new Persona(nombre, apellido));
        }
        
        System.out.println("La lista de persona es: ");
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            System.out.println("Persona "+una_lista_personas.get(i));
        }
        
    }
    
}
