/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Aula {
    final static int cantidad_sillas = 25;
    final static int cantidad_mesas = 6;
    List<Silla> sillas;
    List<Mesa> mesas;
    List<Alumnos> list_Alumnos;
    private Profesor unProfesor;
    
    private int obtenerCantidadAlumnos(int min, int max){
        return min + ( ( max - min) * (int)(Math.random()*1000)) / 1000;
    }
    
    public Aula() {
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        mesas = new ArrayList<>();
        list_Alumnos = new ArrayList<>();
        int cantidad_de_alumnos = obtenerCantidadAlumnos(5, 30);
        
        for (int i = 0; i < cantidad_de_alumnos; i++) {
            list_Alumnos.add(new Alumnos());
        }
        
        for (int i = 0; i < cantidad_sillas; i++) {
            sillas.add(new Silla());
        }

        for (int i = 0; i < cantidad_mesas; i++) {
            mesas.add(new Mesa());
        }
    }
    
    public int dameCantidadDeSillas(){
        return sillas.size();
    }
    
    public int dameCantidadDeAlumnos() {
        return list_Alumnos.size();
    }
    
    public int dameCantidadMesas(){
        return mesas.size();
    }
}
