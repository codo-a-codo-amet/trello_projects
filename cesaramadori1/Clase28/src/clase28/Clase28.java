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
        System.out.println("Ingrese la cantidad de Personas");
        Scanner sc = new Scanner(System.in);
        int cant_personas = sc.nextInt();
        String[] nombres= new String[]{"Juan","Pedro","Manuel","Miguel","Anibal","Jorge","Ariel","Roberto","Carlos","Sergio"};
        String[] apellidos = new String[]{"Lopez","Gonzalez","Alvarez","Martinez","Gimenez","Rodriguez","Perez","Lorenzi","Maradona","Tevez"};
        
        List<Persona> lista_de_personas = new ArrayList<>();
        for (int i = 0; i < cant_personas; i++) {
            //System.out.println("");
            /*System.out.println("Ingrese el nombre de la persona");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido de la persona");
            String apellido = sc.next();
            */
            //lista_de_personas.add(new Persona(nombre, apellido));
            lista_de_personas.add(new Persona(nombres[i], apellidos[i]));
        }
        System.out.println("Listado de Personas");
        System.out.println(lista_de_personas);
        
        /*for (Persona personita : lista_de_personas) {
            System.out.println("Persona con nombre "+ personita.getNombre()+ " y apellido " + personita.getApellido());
        }*/
        System.out.println("Ingrese el nombre o apellido de la persona a buscar");
        String nombre_a_buscar = sc.next();
        boolean Encontrado = false;
        for (int i = 0; i < lista_de_personas.size(); i++) {
            
            if ((lista_de_personas.get(i).getNombre().equalsIgnoreCase(nombre_a_buscar))||(lista_de_personas.get(i).getApellido().equalsIgnoreCase(nombre_a_buscar))) {
                
                System.out.println("La persona buscada es "+ lista_de_personas.get(i).toString());
                Encontrado=true;
            }else{
                
            }
        }
        if (Encontrado==false) {
            System.out.println("No se encontro la persona");
        }
    }
    
    
    
}
