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
    private Profesor unProfesor;
    private int sillasLibres;
    List <Alumno> alumnos;
    List <Silla> sillas;
    List <Mesa> mesas;
    public Aula(){
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        alumnos = new ArrayList<>();
        mesas = new ArrayList<>();
        int cantidad_sillas = 24;
        int cantidad_mesas = 8;
        for (int i = 0; i < cantidad_sillas ; i++) {
            sillas.add(new Silla());
        }
        for (int i = 0; i < cantidad_mesas ; i++) {
            mesas.add(new Mesa());
        }
        for (int i = 0; i < Aleatorio(1,24) ; i++) {
            alumnos.add(new Alumno());
        }
        sillasLibres= sillas.size() - alumnos.size();
    }
    public int dameCantidadDeSillas(){
    return sillas.size();
}
    public int dameCantidadDeMesas(){
    return mesas.size();
}
    public int dameCantidadDeAlumnos(){
    return alumnos.size();
}
    private int Aleatorio(int d, int h){
        return (int)(Math.random()*(h - d))+d;
    }
    public int DameSillasLibres(){
        return sillasLibres;
    }
}

