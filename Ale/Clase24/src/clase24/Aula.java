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
    List<Silla> sillas;
    private Profesor unProfesor;
    
    private int obtenerCantidadAlumnos(int min, int max){
        return min + ( ( max - min) * (int)(Math.random()*1000)) / 1000;
    }
    
    public Aula() {
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        int cantidad_de_alumnos = obtenerCantidadAlumnos(5, 30);
        
        for (int i = 0; i < cantidad_sillas; i++) {
            sillas.add(new Silla());
        }

    }
    
    public int dameCantidadDeSillas(){
        return sillas.size();
    }
}
