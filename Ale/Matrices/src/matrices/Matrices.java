package matrices;

public class Matrices {

    public static void main(String[] args) {
        int[][] matriz1 = {{7, 9}, {8, -4}, {-1, -3}}; // Declarar y asignar
        int[][] matriz2 = new int[3][2]; //Declara matriz de dos dimensiones

        //Imprimir matriz1
        System.out.println("El valor de la primera fila y la primera columna es: " + matriz1[0][0]);
        System.out.println("El valor de la primera fila y la segunda columna es: " + matriz1[0][1]);
        System.out.println("El valor de la segunda fila y la primera columna es: " + matriz1[1][0]);
        System.out.println("El valor de la segunda fila y la segunda columna es: " + matriz1[1][1]);
        System.out.println("El valor de la tercera fila y la primera columna es: " + matriz1[2][0]);
        System.out.println("El valor de la tercera fila y la segunda columna es: " + matriz1[2][1]);

        //Llenar matriz con for
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[0][j] = j + 1;
                matriz2[1][j] = (j + 1) + 2;
                matriz2[2][j] = (j + 1) + 4;
            }
        }
        //Imprimir con for
        System.out.println("");
        for (int k = 0; k < matriz2.length; k++) {
            
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.println(matriz2[k][j]);
            }

        }

    }

}
