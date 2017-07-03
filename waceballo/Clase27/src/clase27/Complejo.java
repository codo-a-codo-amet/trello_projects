/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

<<<<<<< HEAD
import java.util.*;
=======
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
>>>>>>> c5aa40698d0f4966341a09c6e2383107e7674a00

/**
 *
 * @author alumno
 */
<<<<<<< HEAD
public class Complejo implements IComplejo {

    protected List<Salas> lista_de_salas;

    public Complejo() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new Salas());
=======
public class Complejo implements IComplejo{
    List<String> nombres;
    protected String localidad;
    
    Peliculas pelicula;
    private int v;
    
    public Complejo() {
        pelicula = new Peliculas();
        
    }
    
    public Complejo(int complejo) {
        v = complejo;
    }
    
    public List<String> getComplejos(){
        nombres = new ArrayList<>();
        nombres.add("Abasto");
        nombres.add("Dot");
        nombres.add("Village");
        nombres.add("Cinemax");
        nombres.add("Avellaneda");
        
        return nombres;
        
    }
    
    public String getPelicula(int valor){
        return pelicula.getPeliculas().get(valor);
    }
    
    public Integer getSala(int valor){
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
            
>>>>>>> c5aa40698d0f4966341a09c6e2383107e7674a00
        }
        return listaPeliculas;
    }

<<<<<<< HEAD
    public String getComplejoNombre() {
        return "Complejo Abasto";
    }

    public List<Peliculas> getListaDePeliculas() {
     return new ArrayList<>();
    }

    public List<Salas> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<Butacas> getListaButacasLibres(Salas paraEstaSala){
        return new ArrayList<>();
    }
=======
    @Override
    public List<Salas> getListaDeSalas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
>>>>>>> c5aa40698d0f4966341a09c6e2383107e7674a00
}
