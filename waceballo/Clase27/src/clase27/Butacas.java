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
public class Butacas {

    List<Integer> cantidadButacas;

    private Integer cantDisponibles;
    private Integer cantOcupadas;

    public Butacas() {

    }

    private int v;
    
    public Butacas(int cantidad) {
        v = cantidad;
    }

    public List<Integer> getButacas(){
        cantidadButacas = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            cantidadButacas.add(i);
        }
        
        return cantidadButacas;        
    }
    

    public Integer getCantDisponibles() {
        return cantDisponibles;
    }

    public void setCantDisponibles(Integer cantDisponibles) {
        this.cantDisponibles = cantDisponibles;
    }

    public Integer getCantOcupadas() {
        return cantOcupadas;
    }

    public void setCantOcupadas(Integer cantOcupadas) {
        this.cantOcupadas = cantOcupadas;
    }

    public int dameButacasOcupadas() {
        return cantOcupadas = 10;
    }

    public int dameButacasDisponibles() {
        return cantDisponibles = 5;
    }

    
    
    
}
