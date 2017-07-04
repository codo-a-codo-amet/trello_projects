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

    private List<Salas> lista_de_salas;
    private List<Peliculas> lista_de_peliculas;
    
    private Salas sala = new Salas(5);

    protected String localidpad;
    private int v;

    private Peliculas pelicula;
    private List<String> nombres;

    public Complejo() {

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
        return pelicula.getListaPeliculas().get(valor);
    }

    public Integer getSalas(int valor) {
        return sala.getListaSalas().get(valor);
    }

    @Override
    public String getComplejoNombre() {
        return null;
    }
  
    @Override
    public List<Peliculas> getListaDePeliculas() {
        List<Peliculas> listaPeliculas;
        listaPeliculas = new ArrayList<>();
        for (Iterator<Peliculas> iterator = lista_de_peliculas.iterator(); iterator.hasNext();) {
            Peliculas peli = iterator.next();
            //listaPeliculas.add(peli.getListaPeliculas());
        }
        return listaPeliculas;
    }

    @Override
    public List<Salas> getListaDeSalas() {
        return lista_de_salas;
    }

    @Override
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        return new ArrayList<>();
    }


}
