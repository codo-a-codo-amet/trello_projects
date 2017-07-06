/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/**
 *
 * @author alumno
 */
public class Alumno  extends Persona{
    private Integer calificacion;

    /**
     * @return the calificacion
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
}
