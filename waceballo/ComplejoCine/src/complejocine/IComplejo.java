/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocine;

import java.util.List;

/**
 *
 * @author walter
 */
public interface IComplejo {
    public String getComplejoNombre();

    public List<Pelicula> getListaDePeliculas();

    public List<Sala> getListaDeSalas();

    public List<Butaca> getListaButacasLibres(Sala paraEstaSala);
    
}
