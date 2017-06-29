import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public interface IComplejo {
    public String getComplejoNombre();
    
    public List<Pelicula> getListaDePeliculas();
    
    public List<Sala> getListaDeSalas();
    
    public List<Butaca> getListaDeButacasLibres(Sala paraEstaSala);
}
