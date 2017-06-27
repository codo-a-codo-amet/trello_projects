/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

/**
 *
 * @author alumno
 */
public class Butacas {
    private Integer cantButacas;
    private Integer cantDisponibles;
    private Integer cantOcupadas;
    
    public Butacas() {

    }
    
    public int dameButacas(){
        return cantButacas = 15;
    }
    
    public int dameButacasOcupadas(){
        return cantOcupadas = 10;
    }
    
    public int dameButacasDisponibles(){
        return cantDisponibles = 5;
    }
    
    
}
