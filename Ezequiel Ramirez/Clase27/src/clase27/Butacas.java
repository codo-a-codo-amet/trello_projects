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
public class Butacas extends Sala {
    
    final static int cantidad_butacas = 30;
    List<Butacas> butacas;
    List<ButacasOcupadas> butacasOcupadas;
    


public Butacas() {
    butacas = new Arraylist<>();

}

public int dameCantidadButacas() {
    return butacas.size();
}

public int dameCantidadButacasOcupadas(){
    return butacasOcupadas.size();
}

}
