package javaapplication33;

import java.util.Scanner;

public class Perimetro {

    public static void main(String[] args) {

        double grados;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los grados: ");

        grados = entrada.nextDouble();

        double fahrenheit = (grados * (9 / 5)) + 32;

        System.out.println("Son: " + fahrenheit + "Fahrenheit");
    }

}
