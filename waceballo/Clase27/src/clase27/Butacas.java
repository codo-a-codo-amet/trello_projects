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

    List<Integer> listaButacas;
    
    private Integer cantButacas;
    private Integer cantDisponibles;
    private Integer cantOcupadas;

    public Butacas() {

    }

    public Butacas(int v) {
        listaButacas = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            listaButacas.add(i);
        }

        
    }

    public Integer getCantButacas() {
        return cantButacas;
    }

    public void setCantButacas(Integer cantButacas) {
        this.cantButacas = cantButacas;
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

}
