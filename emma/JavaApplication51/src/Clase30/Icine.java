/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase30;

import java.util.*;

/**
 *
 * @author alumno
 */
public interface Icine {
    public String getComplejoNombre();
    
    public List<Pelicula> getListaDePeliculas();
    
    public List<sala> getListaDeSalas();
    
    public List<butacas> getListaButacasLibres(sala paraEstaSala);
}
