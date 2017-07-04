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
public class Complejo implements IComplejo {

    protected String nombre;
    protected String direccion;

    protected List<Sala> Salas;

    public Complejo() {

        nombre = "Village Recoleta";
        direccion = "Vicente Lopez 2050";

        Salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Salas.add(new Sala());
        }

    }

    public List<Pelicula> getListaDePeliculas() {
        List<Pelicula> lista_de_peliculas = new ArrayList<>();
        for (Iterator<Sala> iterator = Salas.iterator(); iterator.hasNext();) {
            Sala unaSala = iterator.next();
            lista_de_peliculas.add(unaSala.getPelicula());
        }

        return lista_de_peliculas;
    }

    public List<Butaca> getListaButacasLibres(Sala paraEstaSala) {

        List<Butaca> lista_de_butacas = paraEstaSala.getListaDeButacas();

        List<Butaca> lista_de_butacas_libres = new ArrayList<>();

        for (Iterator<Butaca> iterator = lista_de_butacas.iterator(); iterator.hasNext();) {
            Butaca unaButaca = iterator.next();
            if (unaButaca.ocupada) {
                System.out.println("EstaOcupada");
            } else {
                lista_de_butacas_libres.add(unaButaca);
                System.out.println("Esta libre");
            }
        }

        return lista_de_butacas_libres;
    }

    public List<Sala> getListaDeSalas() {
        return Salas;
    }

    public int CantidadDeSalas() {
        return Salas.size();
    }

    public String getComplejoNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

}
