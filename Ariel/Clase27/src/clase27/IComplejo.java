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
public interface IComplejo {
    
    public String getComplejoNombre();
    public  List<Peliculas> getListaDePeliculas();
    public List<Salas> getListaDeSalas();
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala);
    
}