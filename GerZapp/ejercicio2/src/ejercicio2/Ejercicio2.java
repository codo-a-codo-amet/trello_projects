/*2) Una empresa paga sueldos calculando el valor de la hora y la cantidad de horas trabajadas por el empleado.
 Si el empleado trabajo más de 100 horas lo premia con $ 50  si trabajó más de 200 horas le dan un 35% más el sueldo original.
 calcular el sueldo.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int valor=0;
       int cantidad=0;
       int premio=50;
       int sueldo=valor*cantidad;
       System.out.println("ingrese el valor de la hora trabajada:");
       valor=entrada.nextInt();
       System.out.println("ingrese la cantidad de horas trabajadas:");
       cantidad=entrada.nextInt();
    
       if( cantidad>100){
           System.out.println("el sueldo es:" + valor*cantidad + premio);
           if (cantidad>200){
               System.out.println("el sueldo es:" + sueldo+ (sueldo*0.35));
           }
       }
    }
}
    

