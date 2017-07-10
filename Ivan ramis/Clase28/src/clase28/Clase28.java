/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

import java.util.Scanner;
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

        System.out.println("Ingrese la cantidad de personas: ");
        Scanner unScanner = new Scanner(System.in);
        int cantidad_de_personas = unScanner.nextInt();

        List<Persona> una_lista_de_personas = new ArrayList();

        for (int i = 0; i < cantidad_de_personas; i++) {

            System.out.println("Ingrese nombre de la persona: ");
            String unNombre = unScanner.next();

            System.out.println("Ingrese apellido de la persona: ");
            String unApellido = unScanner.next();

            una_lista_de_personas.add(new Persona(unNombre, unApellido));
        }
        System.out.println(una_lista_de_personas);

        System.out.println("Ingrese el nombre de la persona a buscar ");
        String nombre_a_buscar = unScanner.next();

        for (int j = 0; j < cantidad_de_personas; j++) {

            Persona unaPersona = una_lista_de_personas.get(j);
            String nombre_de_persona = unaPersona.getNombre();

            if (nombre_de_persona.equalsIgnoreCase(nombre_a_buscar)) {
                System.out.println("Encontre a la persona! ");
            }

            System.out.println("Ingrese el apellido de la persona a buscar ");
            String apellido_a_buscar = unScanner.next();

            for (int i = 0; i < cantidad_de_personas; i++) {
                Persona unApellido = una_lista_de_personas.get(i);
                String apellido_de_persona = unApellido.getApellido();

                if (apellido_de_persona.equalsIgnoreCase(apellido_a_buscar)) {
                    
                }
            }

        }

    }

}
