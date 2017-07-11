/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe28;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Classe28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Ingrese sa cantidad  de personas");
        Scanner unScanner = new Scanner (System.in);
        int cantidad_de_personas = unScanner.nextInt();
        
        List <Persona> una_lista_de_personas = new ArrayList();
        
        for (int i = 0; i < cantidad_de_personas; i ++){
            
            System.out.println("Ingrese el nombre de la persona");
        String unNombre = unScanner.next();
        
           System.out.println("Ingrese el Apellido de la persona");
        String unApellido = unScanner.next();
        
            una_lista_de_personas.add(new Persona(unNombre,unApellido));
        
        
        
    }
        for (Persona una_lista_de_persona : una_lista_de_personas) {
            
            System.out.println("Nombres " + una_lista_de_persona.getNombre()+" "+una_lista_de_persona.getApellido() );
        }
            System.out.println(una_lista_de_personas);
            
            System.out.println("Ingrese el nombre de la persona a buscar");
            String nombre_a_buscar = unScanner.next();
            boolean lohabraEncontrado = false;
            for (int i = 0; i < cantidad_de_personas; i++){
                
                Persona unaPersona = una_lista_de_personas.get(i);
               if (una_lista_de_personas.get(i).getNombre().equals(nombre_a_buscar)) {
                   System.out.println("Se encontro el nombre;"+ unaPersona);
                   lohabraEncontrado = true;
        } 
            
            }
            if(lohabraEncontrado == true){
                System.out.println("Tubimos exito");
            }
                else{
                System.out.println("No pudimos encontrar el nombre "+nombre_a_buscar+" en la lista.");
            }    
            
            
            
            
            
        }
    
}
