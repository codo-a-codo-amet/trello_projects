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
    
    public  String listado_de_Peliculas[] = new String[]{"E.T., el extraterrestre (1982)",
            "Volver al futuro (1985)", "Tiburon (1975)", "Cortocircuito (1986)","Gremlins (1984)",
            "StarWars - Una nueva esperanza (1977)", "IT (1990)", "Martes 13 (1980)", "Critters - Ojo, Muerden (1986)", "Chucky - Muñeco Diabólico (1988)"};
    Pelicula laPelicula;
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
        
        for (int i = 0; i < listado_de_Peliculas.length; i++) {
            laPelicula = new Pelicula(listado_de_Peliculas[i]);
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
