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
public class UserProfile extends Persona {
     protected String email;
     protected String password;

    public UserProfile(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public UserProfile(String email, String password, String nombre, String apellido) {
        super(nombre, apellido);
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
     
}
