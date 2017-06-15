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

    final static int cantidad_sillas = 20;
    final static int cantidad_mesas = 5;

    List<Silla> sillas;
    List<Mesa> mesas;

    private Profesor unProfesor;

    public Aula() {
        unProfesor = new Profesor();
        sillas = new ArrayList<>();
        mesas = new ArrayList<>();

        for (int i = 0; i < cantidad_sillas; i++) {
            sillas.add(new Silla());
        }

        for (int i = 0; i < cantidad_mesas; i++) {
            mesas.add(new Mesa());
        }

    }

    public int dameCantidadSillas() {
        return sillas.size();
    }

    public int dameCantidadMesas() {
        return mesas.size();
    }

}
