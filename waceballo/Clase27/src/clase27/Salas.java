/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Salas {

    private List<Butacas> lista_de_butacas;
    private Butacas listaButacas;
    private List<Integer> cantidadSalas;
    private int v;

    public Salas() {

    }

    public Salas(int salas) {
        v = salas;
    }

    public List<Integer> getListaSalas() {
        cantidadSalas = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            cantidadSalas.add(i);

        }

        return cantidadSalas;

    }

}
