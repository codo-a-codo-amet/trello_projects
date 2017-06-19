/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Alumnos extends Persona{
    List<Persona> alumno;
    
    public Alumnos(){
        alumno = new ArrayList();
    }

    public void cargarAlumnos(){
        Persona al = new Persona();
        alumno.add(new Persona());
    }
    
    
}
