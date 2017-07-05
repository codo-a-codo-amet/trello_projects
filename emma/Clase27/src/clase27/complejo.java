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
<<<<<<< HEAD
<<<<<<< HEAD
public class complejo {
    
}
=======
public class complejo extends cine {
       
    public complejo () {
    
    complejo = "Village Caballito";
    pelicula = "Mi Villano Favorito 3";
    horarioPelicula = "19.25";        
    sala = "8";
    butacas = "c23, c24";
    }

}     
>>>>>>> ba0f585ddaf90f5eec4ae9bb470db98baceac1a4
=======
public class complejo implements IComplejo {

    protected String nombreComplejo;
    protected List<sala> lista_de_salas;

    public complejo() {
        nombreComplejo = "Ahora si le puse una property";
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new sala());
        }
    }

    public String getComplejoNombre() {
        return nombreComplejo;
    }

    public List<peliculas> getListaDePeliculas() {

        List<peliculas> lista_de_peliculas = new ArrayList<>();

        for (Iterator<sala> iterator = lista_de_salas.iterator(); iterator.hasNext();) {
            sala unaSala = iterator.next();
            lista_de_peliculas.add(unaSala.getPelicula());
        }

        return lista_de_peliculas;
    }

    public List<sala> getListaDeSalas() {
        return lista_de_salas;
    }

    public List<butacas> getListaButacasLibres(sala paraEstaSala) {

        List<butacas> lista_de_butacas = paraEstaSala.getListaButacas();
        List<butacas> lista_de_butacas_libres = new ArrayList<>();
        for (Iterator<butacas> iterator = lista_de_butacas.iterator(); iterator.hasNext();) {
            butacas unaButaca = iterator.next();
            if (unaButaca.estaOcupada) {
                System.out.println("EstaOcupada");
            } 
            else {
                System.out.println("Esta libre");
            }
        }

        return lista_de_butacas_libres;
    }
}
>>>>>>> e3287e901a6e0301b586032fc5ffbf1b3fcdb7cd
