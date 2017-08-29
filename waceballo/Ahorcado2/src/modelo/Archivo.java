/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wceba
 */
public class Archivo {

    public BufferedReader getArchivo(String link) {

        FileReader lector = null;
        BufferedReader br = null;

        try {
            File Arch = new File(link);
            if (!Arch.exists()) {
                System.out.println("No existe el archivo");
            } else {
                lector = new FileReader(link);
                br = new BufferedReader(lector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }

    public List<String> LeerArchivo() {
        List<String> texto;
        texto = new ArrayList<>();

        try {
            //ruta de tu archivo
            //String ruta = "C:\\Users\\alumno\\Desktop\\ahorcado.txt";
            String ruta = "C:\\Users\\wceba\\Desktop\\ahorcado.txt";
            //String ruta = "C:\\Users\\walterc\\Desktop\\ahorcado.txt";

            BufferedReader br = getArchivo(ruta);

            String palabras;

            while ((palabras = br.readLine()) != null) {
                texto.add(palabras);
                //System.out.println("palabra: " + palabras);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return texto;
    }


}
