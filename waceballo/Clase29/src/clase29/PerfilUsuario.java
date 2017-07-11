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
public class PerfilUsuario extends Persona {

    protected String nombre_Usuario;
    protected String contrasenia;
    protected String correo;

    public PerfilUsuario(){
        
    }
    
    public PerfilUsuario(String nombre_Usuario, String contrasenia, String correo, String nombre, String apellido) {
        super(nombre, apellido);
        this.nombre_Usuario = nombre_Usuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }    
    
    
    public Boolean EsCorreoValido(String correo) {
        Boolean EsValido = Boolean.FALSE;

        if (correo.contains("@")) {
            EsValido = Boolean.TRUE;
            
        }
        
        return EsValido;
    }

    public Boolean EsContraseniaValida(String contra) {
        Boolean EsValido = Boolean.FALSE;

        if (contra.length() >= 8) {
            EsValido = Boolean.TRUE;
        }

        return EsValido;
    }

    

}
