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
public class Complejo implements IComplejo {

    protected List<Sala> lista_de_salas;

    public Complejo() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new Sala());
        }
    }

    public String getComplejoNombre() {
        return "No le puse una property";
    }

    public List<Pelicula> getListaDePeliculas() {
        List<Pelicula> lista_de_peliculas = new ArrayList<>();
        for (Iterator<Sala> iterator = lista_de_salas.iterator(); iterator.hasNext();) {
            Sala unaSala = iterator.next();
            lista_de_peliculas.add(unaSala.getPelicula());
        }
        
        return lista_de_peliculas;
    }

    public List<Sala> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<Butaca> getListaButacasLibres(Sala paraEstaSala){
        return new ArrayList<>();
    }
}
