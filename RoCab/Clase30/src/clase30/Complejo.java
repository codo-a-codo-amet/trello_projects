/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase30;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Complejo implements IComplejo {

    protected List<Salas> lista_de_salas;
    protected String localidad;
    private int v;

    Peliculas pelicula;
    List<String> nombres;

    public Complejo() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new Salas());

            pelicula = new Peliculas();

        }

    }
    
    public List<String> getComplejos() {
        nombres = new ArrayList<>();
        nombres.add("Abasto");
        nombres.add("Dot");
        nombres.add("Village");
        nombres.add("Cinemax");
        nombres.add("Avellaneda");

        return nombres;

    }

    public String getPelicula(int valor) {
        return pelicula.getPeliculas().get(valor);
    }

    public Integer getSala(int valor) {
        return pelicula.getSalas(valor);
    }

    @Override
    public String getComplejoNombre() {
        return getComplejos().get(v);
    }

    @Override
    public List<Peliculas> getListaDePeliculas() {
        List<Peliculas> listaPeliculas = new ArrayList<>();
        for (Iterator<Peliculas> iterator = listaPeliculas.iterator(); iterator.hasNext();) {
            Peliculas peli = iterator.next();
        }
        return listaPeliculas;
    }

    public List<Salas> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        return new ArrayList<>();
    }


}
