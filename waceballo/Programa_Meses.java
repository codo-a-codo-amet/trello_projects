package Prueba001;

import java.io.*;

public class Programa_Meses {

    public static String calendario(int nummes) {
        String valormes;
        switch (nummes) {
            case 1:
                valormes = "Enero";
                break;
            case 2:
                valormes = "Febrero";
                break;
            case 3:
                valormes = "Marzo";
                break;
            case 4:
                valormes = "Abril";
                break;
            case 5:
                valormes = "Mayo";
                break;
            case 6:
                 valormes = "Junio";
                break;
            case 7:
                valormes = "Julio";
                break;
            case 8:
                valormes = "Agosto";
                break;
            case 9:
                valormes = "Septiembre";
                break;
            case 10:
                valormes = "Octubre";
                break;
            case 11:
                valormes = "Noviembre";
                break;
            case 12:
                valormes = "Diciembre";
                break;
            default:
                valormes = "Inexistente";
        }
        return valormes;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String nummes;
        String valormes;
        do {
            System.out.println("Ingrese un numero de mes");
            nummes = bufEntrada.readLine();
            valormes = calendario(Integer.parseInt(nummes));
            System.out.println("El mes es " + valormes);
        } while (valormes.equals("Inexistente"));
    }

}
