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
public class Complejo  implements IComplejo {
     
    protected List<Salas> lista_de_salas;

    public Complejo() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new Salas());
        }
    }

    public String getComplejoNombre() {
        return "No le puse una property";
    }

    public List<Peliculas> getListaDePeliculas() {
        List<Peliculas> lista_de_peliculas = new ArrayList<>();
        for (Iterator<Salas> iterator = lista_de_salas.iterator(); iterator.hasNext();) {
            Salas unaSala = iterator.next();
            lista_de_peliculas.add(unaSala.getPeliculas());
        }
        
        return lista_de_peliculas;
    }

    public List<Salas> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<Butacas> getListaButacasLibres(Salas paraEstaSala){
        return new ArrayList<>();
    }
}
