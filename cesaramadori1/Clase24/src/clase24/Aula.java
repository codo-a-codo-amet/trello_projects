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
    List <Silla> sillas;
    public Aula(){
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        int cantSillas = 24;
        for (int i = 0; i < cantSillas ; i++) {
            sillas.add(new Silla());
        }
    }
    public int dameCantidadDeSillas(){
    return sillas.size();
}
}

