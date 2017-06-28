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

    public Butacas(int cantidad) {
        salaButacas(cantidad);
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


    
    
    protected int salaButacas(int v){
        
        for (int i = 0; i < v; i++) {
            cantButacas += v;
        }
        
        return cantButacas;
    }
    
    public int dameButacasOcupadas(){
        return cantOcupadas = 10;
    }
    
    public int dameButacasDisponibles(){
        return cantDisponibles = 5;
    }
    
    
}
