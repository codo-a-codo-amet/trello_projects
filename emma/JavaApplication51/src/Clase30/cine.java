/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase30;

import java.util.*;

/**
 *
 * @author alumno
 */


public class cine {

    protected List<sala> lista_de_salas;

    public cine() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new sala());
        }

    }
}