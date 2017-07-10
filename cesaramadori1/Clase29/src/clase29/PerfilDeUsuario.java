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
public class PerfilDeUsuario extends Persona {
    private String email;
    private String usuario;
    private String password;

    public PerfilDeUsuario(){
    }
    
    public PerfilDeUsuario(String email, String usuario, String password, String nombre, String apellido, String edad, char sexo, int dni) {
        super(nombre, apellido, edad, sexo, dni);
        this.email = email;
        this.usuario = usuario;
        this.password = password;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
