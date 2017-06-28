/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

/**
 *
 * @author ivanr
 */
public class Pelicula {
    
    protected String nombre;
    protected String horario;
    protected String clasificacion;
    
public Pelicula (){
    
    nombre = "La antropologa asesina II";
    horario= "21:45";
    clasificacion = "+21";    
}

public String GetNombre(){
    return nombre;
}

public String GetHorario(){
    return horario;
}
}
