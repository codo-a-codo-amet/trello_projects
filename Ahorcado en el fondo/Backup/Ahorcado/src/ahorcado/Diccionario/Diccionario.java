/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Diccionario;

import ahorcado.Modelo.Palabra;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Diccionario implements IDiccionario<Palabra>{
    //final String fullPath = "ahorcado.txt";
    final String fullPath = "listadoGeneral.txt";
        boolean loadInternatl = true;
        BufferedReader buffer = null;
        List <Palabra> listadoPalabras;
    
        public Diccionario (){
            listadoPalabras = new ArrayList<>();
        try{
            if (loadInternatl) {
                //InputStream is = Diccionario.class.getResourceAsStream("ahorcado.txt");
                InputStream is = Diccionario.class.getResourceAsStream("listadoGeneral.txt");
                buffer = new BufferedReader(new InputStreamReader(is));
            } else {
                FileReader reader = new FileReader(fullPath);
                buffer = new BufferedReader(reader);
            }

            String linea;
            while ((linea = buffer.readLine()) != null) {
                
                listadoPalabras.add(new Palabra(linea, false));
                //System.out.println(linea);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ups File not found");
        } catch (IOException ioE) {
            System.out.println("Ups IO error");
        }

    }

    @Override
    public List<Palabra> EntregarDiccionario() {
        return listadoPalabras;
    }

}
