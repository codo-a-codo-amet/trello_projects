/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Aula {
    static int cantidad_sillas = 10;
    List<Silla> sillas;
    private Profesor  unProfesor;
    
public Aula(){
    unProfesor = new Profesor();
    sillas = new ArrayList<Silla>();
    
    for (int i=0; i<cantidad_sillas; i++){
    sillas.add(new Silla());
}
}
public int dameCantidadDeSillas(){
return sillas.size();
}
}