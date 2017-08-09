/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import java.util.*;
/**
 *
 * @author alumno
 */
public class Vehiculo {
    public static int kilometrosBicicleta = 0;
    public static int kilometrosCoche = 0;
    public static int kilometrosTotales = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Vehiculo V = new Vehiculo();
    
    int opcion, valorIngresado;
    
    Scanner valor = new Scanner(System.in);
    
    do {
    
    System.out.println();
    
    System.out.println("VEHÍCULOS");
    System.out.println();
    System.out.println("1. Ingresar kilometraje de la bicicleta");
    System.out.println("2. Ingresar kilometraje del coche");
    System.out.println("3. Ver kilometraje de la bicicleta");
    System.out.println("4. Ver kilometraje del coche");
    System.out.println("5. Ver kilometraje total");
    System.out.println("6. Salir");
    System.out.println();
    System.out.print("Elegir una opción (1-6): ");

    Scanner leer = new Scanner(System.in);
    opcion = leer.nextInt();
    
    
    switch (opcion) {
        
        case 1:
            System.out.print("Ingrese los kilómetros: ");
            valorIngresado = valor.nextInt();
            kilometrosBicicleta += valorIngresado;
            break;
        case 2:
            System.out.print("Ingrese los kilómetros: ");
            valorIngresado = valor.nextInt();
            kilometrosCoche += valorIngresado;
            break;
        case 3:    
            System.out.print("Los kilómetros de la bicicleta son: ");
            System.out.println(kilometrosBicicleta);
            break;
        case 4:    
            System.out.print("Los kilómetros del coche son: ");
            System.out.println(kilometrosCoche);
            break;
        case 5:    
            System.out.print("Los kilómetros totales son: ");
            System.out.println(kilometrosTotales);
            break;
    }
    
    
        
    } while(opcion != 6);


}    
    // TODO code application logic here
}