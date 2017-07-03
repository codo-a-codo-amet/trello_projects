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
public class sala {

    protected peliculas unaPelicula;
    protected List<butacas> lista_de_butacas;

    public sala() {
        unaPelicula = new peliculas();
        lista_de_butacas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_butacas.add(new butacas());
        }
    }
    
    public peliculas getPelicula(){
        return unaPelicula;
    }
    
    public List<butacas> getListaButacas() {
        return lista_de_butacas;
    }
}
