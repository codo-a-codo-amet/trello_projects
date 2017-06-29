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
public class Sala {

    public String[] filas = new String[]{"D ", "E ", "F ", "G ", "H ", "I ", "J ", "K ", "L ", "M ", "N ", "O "};
    public int asientosPorFila = 20;
    public int numeroasiento;
    public String nombre;
    
    
    Pelicula laPelicula;
    List<Butacas> asientos;
    List<Horario> horarios;

    public Sala(String nombre, Pelicula laPelicula) {
        this.nombre = nombre;
        this.laPelicula = laPelicula;
        asientos = new ArrayList();
        for (int i = 0; i < filas.length; i++) {
            for (int j = 1; j < asientosPorFila; j++) {
                asientos.add(new Butacas(filas[i] + j));
            }
        }
        horarios = new ArrayList();
        for (int i = 12; i <= 24; i++) {
            horarios.add(new Horario(i));
            i++;
        }
        
        
        
        
    }

    public Pelicula getLaPelicula() {
        return laPelicula;
    }

    public void setPeli1(Pelicula laPelicula) {
        this.laPelicula = laPelicula;
    }

    public List<Butacas> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Butacas> asientos) {
        this.asientos = asientos;
    }
    
    public String toString(){
        return nombre;
    }
}
