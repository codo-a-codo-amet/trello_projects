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
public class Director extends Pelicula{
    
    /**
     *
     */
    protected String nombreDirector;
    protected String apellidoDirector;
    /**
     *
     */
    protected String apellido;

    public Director(String titulo, String genero, int horario, String breveDescripcion) {
        super(titulo, genero, horario, breveDescripcion);
        this.nombreDirector = "Lily y Lana";
        this.apellidoDirector = "Wachowsky";
    }

}
