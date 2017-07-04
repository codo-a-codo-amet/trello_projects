/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Peliculas {

    List<String> nombrePeliculas;

    public Peliculas() {

    }

    public List<String> getListaPeliculas() {
        nombrePeliculas = new ArrayList<>();

        nombrePeliculas.add("Mi Villano Favorito 3");
        nombrePeliculas.add("Mujer Maravilla");
        nombrePeliculas.add("La Momia");
        nombrePeliculas.add("Piratas del Caribe 5");
        nombrePeliculas.add("Solo se vive una vez");

        return nombrePeliculas;

    }


    public String damePeliculaHorario(int valor) {
        return "Horario ";
    }

}
