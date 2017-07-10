/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

/**
 *
 * @author alumno
 */
public class PerfilUsuario extends Persona{
    protected String nombre_Usuario;
    protected String contrasenia;
    protected String correo;
    
    public PerfilUsuario(String nombre_Usuario, String contrasenia, String correo, String nombre, String apellido) {
        super(nombre, apellido);
        this.nombre_Usuario = nombre_Usuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
