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
public class Sala {

    protected Pelicula unaPelicula;
    protected List<Butaca> lista_de_butacas;

    public Sala() {
        unaPelicula = new Pelicula();
        lista_de_butacas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_butacas.add(new Butaca());
        }
    }
}
