/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author alumno
 */
public class Loader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try {
            FileReader reader = new FileReader("ahorcado.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Ups File not found");
        }
        
        
    }
    
}
