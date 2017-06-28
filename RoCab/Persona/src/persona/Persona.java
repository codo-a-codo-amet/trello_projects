package persona;
import java.util.Scanner;

public class Persona {
 static int edad = 0;
   static String nombre = "";
    public static void main(String[] args) {
    cargaDatos();
    Mayor(edad);
             
    
    
    
    }
    static void cargaDatos(){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.next();
    System.out.println("Ingrese la edad: ");
    edad = teclado.nextInt();  
    
    }
    static String Mayor(int edad){
     String cadena="";
        if (edad > 18) {
            System.out.println("La edad "+ edad + " es mayor a 18");
        }else{
            System.out.println("La edad " + edad + " es menor a 18");
        }
        return cadena;
    
    
    }
    
}
