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
public class complejo implements IComplejo {

    protected String nombreComplejo;
    protected List<sala> lista_de_salas;

    public complejo() {
        nombreComplejo = "Ahora si le puse una property";
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new sala());
        }
    }

    public String getComplejoNombre() {
        return nombreComplejo;
    }

    public List<peliculas> getListaDePeliculas() {

        List<peliculas> lista_de_peliculas = new ArrayList<>();

        for (Iterator<sala> iterator = lista_de_salas.iterator(); iterator.hasNext();) {
            sala unaSala = iterator.next();
            lista_de_peliculas.add(unaSala.getPelicula());
        }

        return lista_de_peliculas;
    }

    public List<sala> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<butacas> getListaButacasLibres(sala paraEstaSala) {

        List<butacas> lista_de_butacas = paraEstaSala.getListaButacas();
        List<butacas> lista_de_butacas_libres = new ArrayList<>();
        for (Iterator<butacas> iterator = lista_de_butacas.iterator(); iterator.hasNext();) {
            butacas unaButaca = iterator.next();
            if (unaButaca.estaOcupada) {
                System.out.println("EstaOcupada");
            } 
            else {
                System.out.println("Esta libre");
            }
        }

        return lista_de_butacas_libres;
    }
}
