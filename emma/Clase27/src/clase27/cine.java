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
public class cine {
    
<<<<<<< HEAD
}
=======
   protected String complejo;
   protected String pelicula;
   protected String horarioPelicula;
   protected String sala;
   protected String butacas;


public cine(){
complejo = "Village caballito";
pelicula = "Mi Villano Favorito 3";
horarioPelicula = "19.25";        
sala = "8";
butacas = "c23, c24";
    }
=======
>>>>>>> e3287e901a6e0301b586032fc5ffbf1b3fcdb7cd


public class cine {

    protected List<sala> lista_de_salas;

    public cine() {
        lista_de_salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista_de_salas.add(new sala());
        }

<<<<<<< HEAD
>>>>>>> ba0f585ddaf90f5eec4ae9bb470db98baceac1a4
=======
    }
}
>>>>>>> e3287e901a6e0301b586032fc5ffbf1b3fcdb7cd
