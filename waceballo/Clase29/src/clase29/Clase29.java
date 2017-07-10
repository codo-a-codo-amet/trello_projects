/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Clase29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PerfilUsuario usuario;
        
        System.out.println("Complete los campos requeridos para logearse");
        System.out.println("Ingrese su nombre:");
        String nom = teclado.next();
        System.out.println("Ingrese su apellido:");
        String ape = teclado.next();
        System.out.println("Ingrese su correo:");
        String cor = teclado.next();
        System.out.println("Ingrese su contraseña:");
        String pas = teclado.next();
        
        
        
//        int cantidad_de_personas = teclado.nextInt();
//        
//        List<Persona> una_lista_personas = new ArrayList<>();
//        
//        for (int i = 0; i < cantidad_de_personas; i++) {
//            System.out.println("Ingrese un nombre");
//            String nombre = teclado.next();
//            
//            System.out.println("Ingres un apellido");
//            String apellido = teclado.next();
//            
//            una_lista_personas.add(new Persona(nombre, apellido));
//        }
//        
//        System.out.println("La lista de persona es: ");
//        
//        for (int i = 0; i < cantidad_de_personas; i++) {
//            System.out.println("Persona "+i+" "+una_lista_personas.get(i));
//        }
//        
//        System.out.println("Ingrese el nombre o apellido de la persona a buscar");
//        String nombreABuscar = teclado.next();
//        Boolean existe = Boolean.FALSE;
//        
//        for (int i = 0; i < cantidad_de_personas; i++) {
//            Persona unaPersona = una_lista_personas.get(i);
//            String nombrePersona = unaPersona.getNombre();
//            String apellidoPersona = unaPersona.getApellido();
//            
//            if (nombrePersona.equalsIgnoreCase(nombreABuscar) || apellidoPersona.equalsIgnoreCase(nombreABuscar)){
//                existe = Boolean.TRUE;
//            }
//        }
//        
//        if (existe){
//            System.out.println("Perona encontrada");
//        }else{
//            System.out.println("Persona No encontrada");
//        }

        
        
        
    }
    
}
