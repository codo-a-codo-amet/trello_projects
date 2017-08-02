/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.*;

/**
 *
 * @author ivanr
 */
public class Sala {

    protected Integer numero;
    protected Integer cantButacas;
    protected Pelicula unaPelicula;

    List<Butaca> butacas;
    

    public Sala() {

        unaPelicula = new Pelicula();

        butacas = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            butacas.add(new Butaca());
        }

    }

    public Pelicula getPelicula(){
        return unaPelicula;
    }

    public Integer CantButacass() {
        return cantButacas;
    }
    
    public List<Butaca> getListaDeButacas (){
        return butacas;
    }
}
