/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.*;

/**
 *
 * @author ivanr
 */
public class Complejo implements IComplejo {

    protected String nombre;
    protected String direccion;

    protected List<Sala> Salas;

    public Complejo() {

        nombre = "Village Recoleta";
        direccion = "Vicente Lopez 2050";

        Salas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Salas.add(new Sala());
        }

    }
    public List<Sala> getListaDeSalas() {
        return Salas;
    }

    public int CantidadDeSalas() {
        return Salas.size();
    }
    
    public String getComplejoNombre (){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    

}
