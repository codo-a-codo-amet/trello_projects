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
public class Salas {

<<<<<<< HEAD
    protected Peliculas unaPelicula;
    protected List<Butacas> lista_de_butacas;

    public Salas() {
        unaPelicula = new Peliculas();
        lista_de_butacas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_butacas.add(new Butacas());
=======
    List<Integer> cantidadSalas;
    Butacas listaButacas;

    public Salas() {
        listaButacas = new Butacas(10);
    }
        
    private int v;
    
    public Salas(int salas) {
        v = salas;
    }
    
    public List<Integer> getSalas(){
        cantidadSalas = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            cantidadSalas.add(i);
>>>>>>> c5aa40698d0f4966341a09c6e2383107e7674a00
        }
        
        return cantidadSalas;
        
    }
    
<<<<<<< HEAD
    public Peliculas getPelicula(){
        return unaPelicula;
    }
=======
    
    
    
>>>>>>> c5aa40698d0f4966341a09c6e2383107e7674a00
}
