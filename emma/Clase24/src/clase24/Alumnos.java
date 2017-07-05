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

    public void cargarApellido(String Apellido){
        apellido = Apellido;
    }
    
    public String pedirApellido(){
        return apellido;
    }
    
    public void cargarNombre(String Nombre){
        nombre = Nombre;
    }
    
    public String pedirNombre(){
        return nombre;
    }
    
    public void cargarDni(int Dni){
        dni = Dni;
    }
    
    public Integer pedirDni(){
        return dni;
    }
    
    public void cargarAlumnos(Persona p){
        
    }
    
    
}
