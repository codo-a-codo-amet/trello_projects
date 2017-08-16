/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg29;

import java.util.*;
/**
 *
 * @author alumno
 */
public class UserProfile extends Persona {
     protected String email;
     protected String password;
     protected String username;

    public UserProfile(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public UserProfile(String email, String password, String username, String nombre, String apellido) {
        super(nombre, apellido);
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
}