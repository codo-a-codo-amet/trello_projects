/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class Loader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String fullPath = "ahorcado.txt";
        boolean loadInternatl = true;
        BufferedReader buffer = null;
        try {

            if (loadInternatl) {
                InputStream is = Loader.class.getResourceAsStream("ahorcado.txt");
                buffer = new BufferedReader(new InputStreamReader(is));
            } else {
                FileReader reader = new FileReader(fullPath);
                buffer = new BufferedReader(reader);
            }

            String linea;

            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Ups File not found");
        } catch (IOException ioE) {
            System.out.println("Ups IO error");
        }

    }

}
