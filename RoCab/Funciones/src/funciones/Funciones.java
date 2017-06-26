/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

public class Funciones {

    //Variables globales
    static int base = 3;
    static int potencia = 2;

    public static void main(String[] args) {
        int resultado = pow(base, potencia); //Variable local en la que guardamos el valor retornado por la funcion
        System.out.println("El resultado de la potencia es: " + resultado);
        System.out.println("El resultado de la potencia es: " + pow(3, 2));
        imprimir(resultado); //Invocamos al procedimiento imprimir pasandole como parametro resultado
    }

    //Funcion
    static int pow(int num, int potencia) {
        int resultado = num * num;
        potencia--;

        while (potencia != 1) {
            resultado *= num;
            potencia--;
        }
        return resultado;
    }

    // Procedimiento
    static void imprimir(int resultado) {
        System.out.println("El resultado de la pontecia es: " + resultado);
    }

}

