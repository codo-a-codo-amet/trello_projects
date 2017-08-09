/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

/**
 *
 * @author alumno
 */
public class Empleado extends Composite implements IView {

    private String nombre;
    private String apellido;

    Persona unaPersona = new Persona("Juan", "Perez");

    public Empleado() {
        nombre = unaPersona.getNombre();
        apellido = unaPersona.getApellido();
    }

    @Override
    public void Draw(String texto) {

    }

}
