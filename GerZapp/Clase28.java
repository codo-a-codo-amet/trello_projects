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
        System.out.print("ingrese la cantidad de personas");
        Scanner unScanner = new Scanner(System.in);
        int cantidad_de_persona = unScanner.nextInt();

        List<Persona> una_lista_de_persona = new ArrayList();

        for (int i = 0; i < cantidad_de_persona;) {

            System.out.print("Ingrese el nombre de la persona");
            String unNombre = unScanner.next();
            System.out.print("Ingrese el apellido de la persona");
            String unApellido = unScanner.next();

            una_lista_de_persona.add(new Persona(unNombre, unApellido));
        }

        System.out.println("La lsta de persona es:" + una_lista_de_persona);

        System.out.println("Ingrese el nombre de la persona a buscar");

        String nombre_a_buscar = unScanner.next();

        for (int i = 0; i < cantidad_de_persona; i++) {

            Persona unaPersona = una_lista_de_persona.get(i);

            String nombre_de_persona = unaPersona.getNombre();

            if (nombre_de_persona.equalsIgnoreCase(nombre_a_buscar)){
            System.out.println("Encontre a la persona");

        }

        }
    }
}