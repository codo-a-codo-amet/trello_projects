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
public class Complejo {

    protected List<Sala> lista_de_salas;

    public Complejo() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new Sala());
        }

    }
}
