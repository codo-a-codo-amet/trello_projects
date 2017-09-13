/*Ingresar un importe y calcular el iva del mismo , mostrar importe , iva y total.
 
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio;
        double iva;
        double total;
        System.out.println("ingrese el importe:");
        precio = entrada.nextDouble();
         iva = precio * 0.21;
         System.out.println(" el iva del importe es:" + iva);
        System.out.println("el total a abonar es " + total (precio,iva));
        
       
        
    
    
    
        
        
}
    
    public static double total (double precio, double iva){
        
 return precio+iva;
    
   
    }             
    
}

            
    
