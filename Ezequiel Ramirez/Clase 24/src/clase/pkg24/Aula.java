/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Aula {

    private Profesor unProfesor;
    final static int cantidad_sillas = 25;
    final static int cantidad_mesas = 3;
    final static int cantidad_alumnos = 0;
    List<Silla> sillas;
    List<Mesa> mesas;
    List<Alumnos> alumnos;

    private int obtenerCantidadAlumnos(int min, int max) {
        return min + ((max - min) * (int) (Math.random() * 1000)) / 1000;
    }

    public Aula() {
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        mesas = new ArrayList<>();
        alumnos = new ArrayList<>();
        int cantidad_de_alumnos = obtenerCantidadAlumnos(5, 30);
        
        
        for (int i = 0; i < cantidad_sillas; i++) {
            sillas.add(new Silla());

        }
        for (int i = 0; i < cantidad_mesas; i++) {
            mesas.add(new Mesa());
            
        }
        for (int i = 0; i < cantidad_alumnos; i++) {
            alumnos.add(new Alumnos());
        }
    }

    public int dameCantidadDeSillas() {
        return sillas.size();
    }

    public int dameCantidadDeMesas() {
        return mesas.size();
    }

    public int dameCantidadDeAlumnos() {
        return alumnos.size();
    }
}
