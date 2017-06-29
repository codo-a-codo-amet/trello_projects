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

    Pelicula peli1 = new Pelicula("E.T., el extraterrestre (1982)", "Ciencia Ficción", 115);
    List<Butacas> asientos;
    List<Horario> horarios;

    public Sala(String nombre) {
        this.nombre = nombre;
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

    public Pelicula getPeli1() {
        return peli1;
    }

    public void setPeli1(Pelicula peli1) {
        this.peli1 = peli1;
    }

    public List<Butacas> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Butacas> asientos) {
        this.asientos = asientos;
    }

}
